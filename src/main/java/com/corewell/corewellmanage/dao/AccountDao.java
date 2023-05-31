package com.corewell.corewellmanage.dao;

import com.corewell.corewellmanage.domain.Account;
import com.corewell.corewellmanage.domain.request.AccountAddParam;
import com.corewell.corewellmanage.domain.request.AccountParam;
import com.corewell.corewellmanage.domain.request.AccountUpdateParam;
import com.corewell.corewellmanage.domain.response.AccountDTO;
import com.corewell.corewellmanage.domain.template.AccountTemplate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/15:17
 * @Description:
 */
@Mapper
public interface AccountDao {
    /**
     * 查询账号
     *
     * @param account
     * @return
     */
    AccountDTO selectAccount(String account);

    /**
     * 添加账号
     *
     * @param accountAddParam
     * @return
     */
    int addAccount(AccountAddParam accountAddParam);

    /**
     * 修改账号
     *
     * @param accountUpdateParam
     * @return
     */
    int updateAccount(AccountUpdateParam accountUpdateParam);

    /**
     * 删除账号
     *
     * @param id
     * @return
     */
    int deleteAccount(Long id);

    /**
     * 获取账号列表
     *
     * @param accountParam
     * @return
     */
    List<Account> getAccount(AccountParam accountParam);

    /**
     * 获取账号导出列表
     *
     * @param accountParam
     * @return
     */
    List<AccountTemplate> downloadAccount(AccountParam accountParam);

}
