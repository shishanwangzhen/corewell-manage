package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.NetworkCardAddParam;
import com.corewell.corewellmanage.domain.request.NetworkCardParam;
import com.corewell.corewellmanage.domain.request.NetworkCardUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface NetworkCardService {

    /**
     * 添加网卡
     *
     * @param networkCardAddParam
     * @return
     */
    ResultMsg addNetworkCard(NetworkCardAddParam networkCardAddParam);

    /**
     * 修改网卡
     *
     * @param networkCardUpdateParam
     * @return
     */
    ResultMsg updateNetworkCard(NetworkCardUpdateParam networkCardUpdateParam);

    /**
     * 删除网卡
     *
     * @param id
     * @return
     */
    ResultMsg deleteNetworkCard(Long id);

    /**
     * 获取网卡列表
     *
     * @param networkCardParam
     * @return
     */
    ResultMsg getNetworkCard(NetworkCardParam networkCardParam);

}
