package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.MaterialPurchase;
import com.corewell.corewellmanage.domain.request.MaterialPurchaseAddParam;
import com.corewell.corewellmanage.domain.request.MaterialPurchaseParam;
import com.corewell.corewellmanage.domain.request.MaterialPurchaseUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialPurchaseService;
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
@RequestMapping("/corewell/materialPurchase/")
@Api(tags = "物料采购")
public class MaterialPurchaseController {

    @Autowired
    private MaterialPurchaseService materialPurchaseService;

    @ApiOperation(value = "添加物料采购")
    @PostMapping("addMaterialPurchase")
    public ResultMsg addMaterialPurchase(@RequestBody MaterialPurchaseAddParam materialPurchaseAddParam) {
        ResultMsg resultMsg = materialPurchaseService.addMaterialPurchase(materialPurchaseAddParam);
        return resultMsg;
    }


    @ApiOperation("修改物料采购")
    @PostMapping("updateMaterialPurchase")
    public ResultMsg updateMaterialPurchase(@RequestBody MaterialPurchaseUpdateParam materialPurchaseUpdateParam) {
        ResultMsg resultMsg = materialPurchaseService.updateMaterialPurchase(materialPurchaseUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除物料采购")
    @PostMapping("deleteMaterialPurchase")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteMaterialPurchase(Long id) {
        ResultMsg resultMsg = materialPurchaseService.deleteMaterialPurchase(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询物料采购", response = MaterialPurchase.class)
    @PostMapping("getMaterialPurchase")
    public ResultMsg getMaterialPurchase(@RequestBody MaterialPurchaseParam materialPurchaseParam) {
        ResultMsg resultMsg = materialPurchaseService.getMaterialPurchase(materialPurchaseParam);
        return resultMsg;
    }


}

