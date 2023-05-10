package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.Account;
import com.corewell.corewellmanage.domain.request.AccountAddParam;
import com.corewell.corewellmanage.domain.request.AccountParam;
import com.corewell.corewellmanage.domain.request.AccountUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/corewell/account/")
@Api(tags = "账号")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @ApiOperation(value = "添加账号")
    @PostMapping("addAccount")
    public ResultMsg addAccounts(@RequestBody AccountAddParam accountAddParam) {
        ResultMsg resultMsg = accountService.addAccount(accountAddParam);
        return resultMsg;
    }


    @ApiOperation("修改账号")
    @PostMapping("updateAccount")
    public ResultMsg updateAccounts(@RequestBody AccountUpdateParam accountUpdateParam) {
        ResultMsg resultMsg = accountService.updateAccount(accountUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除账号")
    @PostMapping("deleteAccount")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteAccounts(Long id) {
        ResultMsg resultMsg = accountService.deleteAccount(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询账号", response = Account.class)
    @PostMapping("getAccount")
    public ResultMsg getAccounts(@RequestBody AccountParam accountParam) {
        ResultMsg resultMsg = accountService.getAccount(accountParam);
        return resultMsg;
    }


}

