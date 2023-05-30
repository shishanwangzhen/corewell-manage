package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.MaterialName;
import com.corewell.corewellmanage.domain.request.MaterialNameAddParam;
import com.corewell.corewellmanage.domain.request.MaterialNameParam;
import com.corewell.corewellmanage.domain.request.MaterialNameUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialNameService;
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
@RequestMapping("/corewell/materialName/")
@Api(tags = "物料名称")
public class MaterialNameController {

    @Autowired
    private MaterialNameService materialNameService;

    @ApiOperation(value = "添加物料名称")
    @PostMapping("addMaterialName")
    public ResultMsg addMaterialName(@RequestBody MaterialNameAddParam materialNameAddParam) {
        ResultMsg resultMsg = materialNameService.addMaterialName(materialNameAddParam);
        return resultMsg;
    }


    @ApiOperation("修改物料名称")
    @PostMapping("updateMaterialName")
    public ResultMsg updateMaterialName(@RequestBody MaterialNameUpdateParam materialNameUpdateParam) {
        ResultMsg resultMsg = materialNameService.updateMaterialName(materialNameUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除物料名称")
    @PostMapping("deleteMaterialName")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteMaterialName(Long id) {
        ResultMsg resultMsg = materialNameService.deleteMaterialName(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询物料名称", response = MaterialName.class)
    @PostMapping("getMaterialName")
    public ResultMsg getMaterialName(@RequestBody MaterialNameParam materialNameParam) {
        ResultMsg resultMsg = materialNameService.getMaterialName(materialNameParam);
        return resultMsg;
    }


}

