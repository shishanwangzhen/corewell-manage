package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.MaterialApply;
import com.corewell.corewellmanage.domain.request.MaterialApplyAddParam;
import com.corewell.corewellmanage.domain.request.MaterialApplyParam;
import com.corewell.corewellmanage.domain.request.MaterialApplyUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialApplyService;
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
@RequestMapping("/corewell/materialApply/")
@Api(tags = "物料申请")
public class MaterialApplyController {

    @Autowired
    private MaterialApplyService materialApplyService;

    @ApiOperation(value = "添加物料申请")
    @PostMapping("addMaterialApply")
    public ResultMsg addMaterialApply(@RequestBody MaterialApplyAddParam materialApplyAddParam) {
        ResultMsg resultMsg = materialApplyService.addMaterialApply(materialApplyAddParam);
        return resultMsg;
    }


    @ApiOperation("修改物料申请")
    @PostMapping("updateMaterialApply")
    public ResultMsg updateMaterialApply(@RequestBody MaterialApplyUpdateParam materialApplyUpdateParam) {
        ResultMsg resultMsg = materialApplyService.updateMaterialApply(materialApplyUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除物料申请")
    @PostMapping("deleteMaterialApply")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteMaterialApply(Long id) {
        ResultMsg resultMsg = materialApplyService.deleteMaterialApply(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询物料申请", response = MaterialApply.class)
    @PostMapping("getMaterialApply")
    public ResultMsg getMaterialApply(@RequestBody MaterialApplyParam materialApplyParam) {
        ResultMsg resultMsg = materialApplyService.getMaterialApply(materialApplyParam);
        return resultMsg;
    }


}

