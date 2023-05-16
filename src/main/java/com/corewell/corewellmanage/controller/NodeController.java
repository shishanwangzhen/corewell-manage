package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.Node;
import com.corewell.corewellmanage.domain.request.NodeAddParam;
import com.corewell.corewellmanage.domain.request.NodeParam;
import com.corewell.corewellmanage.domain.request.NodeUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.NodeService;
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
@RequestMapping("/corewell/node/")
@Api(tags = "节点")
public class NodeController {

    @Autowired
    private NodeService nodeService;

    @ApiOperation(value = "添加节点")
    @PostMapping("addNode")
    public ResultMsg addNode(@RequestBody NodeAddParam nodeAddParam) {
        ResultMsg resultMsg = nodeService.addNode(nodeAddParam);
        return resultMsg;
    }


    @ApiOperation("修改节点")
    @PostMapping("updateNode")
    public ResultMsg updateNode(@RequestBody NodeUpdateParam nodeUpdateParam) {
        ResultMsg resultMsg = nodeService.updateNode(nodeUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除节点")
    @PostMapping("deleteNode")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteNode(Long id) {
        ResultMsg resultMsg = nodeService.deleteNode(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询节点", response = Node.class)
    @PostMapping("getNode")
    public ResultMsg getNode(@RequestBody NodeParam nodeParam) {
        ResultMsg resultMsg = nodeService.getNode(nodeParam);
        return resultMsg;
    }
    
}

