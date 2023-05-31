package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.MaterialReceipt;
import com.corewell.corewellmanage.domain.request.MaterialReceiptAddParam;
import com.corewell.corewellmanage.domain.request.MaterialReceiptParam;
import com.corewell.corewellmanage.domain.request.MaterialReceiptUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialReceiptService;
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
@RequestMapping("/corewell/materialReceipt/")
@Api(tags = "物料入库")
public class MaterialReceiptController {

    @Autowired
    private MaterialReceiptService materialReceiptService;

    @ApiOperation(value = "添加物料入库")
    @PostMapping("addMaterialReceipt")
    public ResultMsg addMaterialReceipt(@RequestBody MaterialReceiptAddParam materialReceiptAddParam) {
        ResultMsg resultMsg = materialReceiptService.addMaterialReceipt(materialReceiptAddParam);
        return resultMsg;
    }


    @ApiOperation("修改物料入库")
    @PostMapping("updateMaterialReceipt")
    public ResultMsg updateMaterialReceipt(@RequestBody MaterialReceiptUpdateParam materialReceiptUpdateParam) {
        ResultMsg resultMsg = materialReceiptService.updateMaterialReceipt(materialReceiptUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除物料入库")
    @PostMapping("deleteMaterialReceipt")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteMaterialReceipt(Long id) {
        ResultMsg resultMsg = materialReceiptService.deleteMaterialReceipt(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询物料入库", response = MaterialReceipt.class)
    @PostMapping("getMaterialReceipt")
    public ResultMsg getMaterialReceipt(@RequestBody MaterialReceiptParam materialReceiptParam) {
        ResultMsg resultMsg = materialReceiptService.getMaterialReceipt(materialReceiptParam);
        return resultMsg;
    }


}

