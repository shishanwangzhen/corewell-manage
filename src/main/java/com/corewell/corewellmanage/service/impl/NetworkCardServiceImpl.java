package com.corewell.corewellmanage.service.impl;

import com.corewell.corewellmanage.dao.NetworkCardDao;
import com.corewell.corewellmanage.domain.NetworkCard;
import com.corewell.corewellmanage.domain.request.NetworkCardAddParam;
import com.corewell.corewellmanage.domain.request.NetworkCardParam;
import com.corewell.corewellmanage.domain.request.NetworkCardUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.NetworkCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/26/17:43
 * @Description:
 */
@Service("NetworkCardService")
public class NetworkCardServiceImpl implements NetworkCardService {
    @Autowired
    private NetworkCardDao networkCardDao;
    @Override
    public ResultMsg addNetworkCard(NetworkCardAddParam networkCardAddParam) {
        networkCardAddParam.setCreateTime(new Date());
        int result=networkCardDao.addNetworkCard(networkCardAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateNetworkCard(NetworkCardUpdateParam networkCardUpdateParam) {
        int result=networkCardDao.updateNetworkCard(networkCardUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteNetworkCard(Long id) {
        int result=networkCardDao.deleteNetworkCard(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getNetworkCard(NetworkCardParam networkCardParam) {
        List<NetworkCard> list=networkCardDao.getNetworkCard(networkCardParam);
        return ResultMsg.success(list);
    }
}
