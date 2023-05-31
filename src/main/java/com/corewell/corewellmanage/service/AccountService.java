package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.Account;
import com.corewell.corewellmanage.domain.request.AccountAddParam;
import com.corewell.corewellmanage.domain.request.AccountPageParam;
import com.corewell.corewellmanage.domain.request.AccountParam;
import com.corewell.corewellmanage.domain.request.AccountUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface AccountService {

    /**
     * 查询账号
     *
     * @param account
     * @param password
     * @return
     */
    ResultMsg selectAccount(String account, String password);

    /**
     * 添加账号
     *
     * @param accountAddParam
     * @return
     */
    ResultMsg addAccount(AccountAddParam accountAddParam);

    /**
     * 修改账号
     *
     * @param accountUpdateParam
     * @return
     */
    ResultMsg updateAccount(AccountUpdateParam accountUpdateParam);

    /**
     * 删除账号
     *
     * @param id
     * @return
     */
    ResultMsg deleteAccount(Long id);

    /**
     * 获取账号列表
     *
     * @param accountParam
     * @return
     */
    ResultMsg getAccount(AccountParam accountParam);

    /**
     * 分页查询账号
     *
     * @param accountPageParam
     * @return
     */
    List<Account> selectAccounts(AccountPageParam accountPageParam);

    /**
     * 导出账号
     *
     * @param accountParam
     * @param response
     * @return
     */
    ResultMsg downloadAccount(AccountParam accountParam, HttpServletResponse response);



}
