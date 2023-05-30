package com.corewell.corewellmanage.dao;


import com.corewell.corewellmanage.domain.NetworkCard;
import com.corewell.corewellmanage.domain.request.NetworkCardAddParam;
import com.corewell.corewellmanage.domain.request.NetworkCardParam;
import com.corewell.corewellmanage.domain.request.NetworkCardUpdateParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
@Mapper
public interface NetworkCardDao {

    /**
     * 添加网卡
     *
     * @param networkCardAddParam
     * @return
     */
    int addNetworkCard(NetworkCardAddParam networkCardAddParam);

    /**
     * 修改网卡
     *
     * @param networkCardUpdateParam
     * @return
     */
    int updateNetworkCard(NetworkCardUpdateParam networkCardUpdateParam);

    /**
     * 删除网卡
     *
     * @param id
     * @return
     */
    int deleteNetworkCard(Long id);

    /**
     * 获取网卡列表
     *
     * @param networkCardParam
     * @return
     */
    List<NetworkCard> getNetworkCard(NetworkCardParam networkCardParam);

}
