package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.AccountAddParam;
import com.corewell.corewellmanage.domain.request.AccountParam;
import com.corewell.corewellmanage.domain.request.AccountUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;

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

}
