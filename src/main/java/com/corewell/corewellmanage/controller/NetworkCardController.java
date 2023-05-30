package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.NetworkCard;
import com.corewell.corewellmanage.domain.request.NetworkCardAddParam;
import com.corewell.corewellmanage.domain.request.NetworkCardParam;
import com.corewell.corewellmanage.domain.request.NetworkCardUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.NetworkCardService;
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
@RequestMapping("/corewell/networkCard/")
@Api(tags = "网卡")
public class NetworkCardController {

    @Autowired
    private NetworkCardService networkCardService;

    @ApiOperation(value = "添加网卡")
    @PostMapping("addNetworkCard")
    public ResultMsg addNetworkCard(@RequestBody NetworkCardAddParam networkCardAddParam) {
        ResultMsg resultMsg = networkCardService.addNetworkCard(networkCardAddParam);
        return resultMsg;
    }


    @ApiOperation("修改网卡")
    @PostMapping("updateNetworkCard")
    public ResultMsg updateNetworkCard(@RequestBody NetworkCardUpdateParam networkCardUpdateParam) {
        ResultMsg resultMsg = networkCardService.updateNetworkCard(networkCardUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除网卡")
    @PostMapping("deleteNetworkCard")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteNetworkCard(Long id) {
        ResultMsg resultMsg = networkCardService.deleteNetworkCard(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询网卡", response = NetworkCard.class)
    @PostMapping("getNetworkCard")
    public ResultMsg getNetworkCard(@RequestBody NetworkCardParam networkCardParam) {
        ResultMsg resultMsg = networkCardService.getNetworkCard(networkCardParam);
        return resultMsg;
    }


}

