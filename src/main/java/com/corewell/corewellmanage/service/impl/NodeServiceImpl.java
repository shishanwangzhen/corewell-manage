package com.corewell.corewellmanage.service.impl;

import com.corewell.corewellmanage.dao.NodeDao;
import com.corewell.corewellmanage.domain.request.NodeAddParam;
import com.corewell.corewellmanage.domain.request.NodeParam;
import com.corewell.corewellmanage.domain.request.NodeUpdateParam;
import com.corewell.corewellmanage.domain.response.NodeDTO;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/15/10:39
 * @Description:
 */
@Service("NodeService")
public class NodeServiceImpl implements NodeService {
    @Autowired
    private NodeDao nodeDao;

    @Override
    public ResultMsg addNode(NodeAddParam nodeAddParam) {
        nodeAddParam.setCreateTime(new Date());
        int result = nodeDao.addNode(nodeAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateNode(NodeUpdateParam nodeUpdateParam) {
        int result = nodeDao.updateNode(nodeUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteNode(Long id) {
        int result = nodeDao.deleteNode(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getNode(NodeParam nodeParam) {
        List<NodeDTO> list = nodeDao.getNode(nodeParam);
        return ResultMsg.success(list);
    }
}
