package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.MaterialOutbound;
import com.corewell.corewellmanage.domain.request.MaterialOutboundAddParam;
import com.corewell.corewellmanage.domain.request.MaterialOutboundByIds;
import com.corewell.corewellmanage.domain.request.MaterialOutboundParam;
import com.corewell.corewellmanage.domain.request.MaterialOutboundUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialOutboundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/14:46
 * @Description:
 */

@RestController
@RequestMapping("/corewell/materialOutbound/")
@Api(tags = "物料出库")
public class MaterialOutboundController {

    @Autowired
    private MaterialOutboundService materialOutboundService;

    @ApiOperation(value = "添加物料出库")
    @PostMapping("addMaterialOutbound")
    public ResultMsg addMaterialOutbound(@RequestBody MaterialOutboundAddParam materialOutboundAddParam) {
        ResultMsg resultMsg = materialOutboundService.addMaterialOutbound(materialOutboundAddParam);
        return resultMsg;
    }


    @ApiOperation("修改物料出库")
    @PostMapping("updateMaterialOutbound")
    public ResultMsg updateMaterialOutbound(@RequestBody MaterialOutboundUpdateParam materialOutboundUpdateParam) {
        ResultMsg resultMsg = materialOutboundService.updateMaterialOutbound(materialOutboundUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除物料出库")
    @PostMapping("deleteMaterialOutbound")
    @ApiImplicitParam(value = "主键id", name  = "1", required = true)
    public ResultMsg deleteMaterialOutbound(Long id) {
        ResultMsg resultMsg = materialOutboundService.deleteMaterialOutbound(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询物料出库", response = MaterialOutbound.class)
    @PostMapping("getMaterialOutbound")
    public ResultMsg getMaterialOutbound(@RequestBody MaterialOutboundParam materialOutboundParam) {
        ResultMsg resultMsg = materialOutboundService.getMaterialOutbound(materialOutboundParam);
        return resultMsg;
    }

    @ApiOperation(value = "批量修改物料出库", response = MaterialOutbound.class)
    @PostMapping("updateMaterialOutboundByIds")
    public ResultMsg updateMaterialOutboundByIds(@RequestBody MaterialOutboundByIds materialOutboundByIds) {
        ResultMsg resultMsg = materialOutboundService.updateMaterialOutboundByIds(materialOutboundByIds);
        return resultMsg;
    }

}

