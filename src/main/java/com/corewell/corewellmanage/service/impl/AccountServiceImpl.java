package com.corewell.corewellmanage.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.corewell.corewellmanage.dao.AccountDao;
import com.corewell.corewellmanage.domain.Account;
import com.corewell.corewellmanage.domain.request.AccountAddParam;
import com.corewell.corewellmanage.domain.request.AccountPageParam;
import com.corewell.corewellmanage.domain.request.AccountParam;
import com.corewell.corewellmanage.domain.request.AccountUpdateParam;
import com.corewell.corewellmanage.domain.response.AccountDTO;
import com.corewell.corewellmanage.domain.template.AccountTemplate;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.result.ResultStatusCode;
import com.corewell.corewellmanage.service.AccountService;
import com.corewell.corewellmanage.utils.ExcelUtil;
import com.corewell.corewellmanage.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/08/13:56
 * @Description:
 */
@Service("UserService")
@Slf4j
public class AccountServiceImpl implements AccountService {


    private static final String fileName="用户列表";
    @Autowired
    private AccountDao accountDao;



    @Override
    public ResultMsg selectAccount(String account, String password) {
        log.info("selectStudentByAccount:  account:  " + JSON.toJSONString(account));
        AccountDTO accountDTO = accountDao.selectAccount(account);
        if (accountDTO == null) {
            return new ResultMsg(ResultStatusCode.NO_USER);
        }
        if (!password.equals(accountDTO.getPassword())) {
            return new ResultMsg(ResultStatusCode.LOGIN_ERR);
        }
        //准备存放在IWT中的自定义数据
        Map<String, Object> info = new HashMap<>();
        info.put("id", accountDTO.getId());
        info.put("account", account);
        info.put("password", accountDTO.getPassword());
        info.put("name", accountDTO.getName());
        //生成JWT字符串
        String token = JwtUtil.sign(account, info);
        accountDTO.setToken(token);
        return ResultMsg.success(accountDTO);
    }

    @Override
    public ResultMsg addAccount(AccountAddParam accountAddParam) {
        accountAddParam.setCreateTime(new Date());
        int result = accountDao.addAccount(accountAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateAccount(AccountUpdateParam accountUpdateParam) {
        accountUpdateParam.setUpdateTime(new Date());
        int result = accountDao.updateAccount(accountUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteAccount(Long id) {
        int result = accountDao.deleteAccount(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getAccount(AccountParam accountParam) {
        log.info("getAccount:  accountParam:  " + JSON.toJSONString(accountParam));
        List<Account> result = accountDao.getAccount(accountParam);
        return ResultMsg.success(result);
    }

    @Override
    public List<Account> selectAccounts(AccountPageParam accountPageParam) {
        log.info("selectAccounts:  accountParam:  " + JSON.toJSONString(accountPageParam));
        AccountParam accountParam = JSONObject.parseObject(accountPageParam.toString(), AccountParam.class);
        List<Account> result = accountDao.getAccount(accountParam);
        return result;
    }

    @Override
    public ResultMsg downloadAccount(AccountParam accountParam, HttpServletResponse response) {
        log.info("downloadAccount:  accountParam:  " + JSON.toJSONString(accountParam));
        List<AccountTemplate> list = accountDao.downloadAccount(accountParam);
        for (AccountTemplate accountTemplate : list) {
            switch (accountTemplate.getSex()) {
                case "1":
                    accountTemplate.setSex("男");
                    break;
                case "2":
                    accountTemplate.setSex("女");
                    break;
                default:
                    break;
            }

        }
        try {
            ExcelUtil.writeExcel(response, list, fileName, fileName, AccountTemplate.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultMsg.success();
    }
}
