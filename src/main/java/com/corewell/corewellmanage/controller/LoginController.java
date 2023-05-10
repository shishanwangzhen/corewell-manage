package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.request.AccountReq;
import com.corewell.corewellmanage.domain.response.AccountDTO;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.result.ResultStatusCode;
import com.corewell.corewellmanage.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/14:46
 * @Description:
 */

@RestController
@RequestMapping("/login")
@Api(tags = "登录")
public class LoginController {

    @Autowired
    private AccountService accountService;


    @ApiOperation(value = "登录", response = AccountDTO.class)
    @PostMapping("/login")
    public ResultMsg loginTeacher(@RequestBody AccountReq accountReq) {
        String account = accountReq.getAccount();
        String password = accountReq.getPassword();
        if (StringUtils.isEmpty(account) || StringUtils.isEmpty(password)) {
            return new ResultMsg(ResultStatusCode.USERNAME_PASSWORD_NULL);
        }
        ResultMsg resultMsg = accountService.selectAccount(account, password);
        return resultMsg;

    }

    @ApiOperation("退出登录")
    @PostMapping("/loginOut")
    public ResultMsg loginOut() {

        return ResultMsg.success();

    }

}

