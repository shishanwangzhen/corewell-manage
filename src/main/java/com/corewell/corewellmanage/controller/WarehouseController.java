package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.Project;
import com.corewell.corewellmanage.domain.Warehouse;
import com.corewell.corewellmanage.domain.request.WarehouseAddParam;
import com.corewell.corewellmanage.domain.request.WarehouseParam;
import com.corewell.corewellmanage.domain.request.WarehouseUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.WarehouseService;
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
@RequestMapping("/corewell/warehouse/")
@Api(tags = "仓库")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @ApiOperation(value = "添加仓库")
    @PostMapping("addWarehouse")
    public ResultMsg addWarehouse(@RequestBody WarehouseAddParam warehouseAddParam) {
        ResultMsg resultMsg = warehouseService.addWarehouse(warehouseAddParam);
        return resultMsg;
    }


    @ApiOperation("修改仓库")
    @PostMapping("updateWarehouse")
    public ResultMsg updateWarehouse(@RequestBody WarehouseUpdateParam warehouseUpdateParam) {
        ResultMsg resultMsg = warehouseService.updateWarehouse(warehouseUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除仓库")
    @PostMapping("deleteWarehouse")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteWarehouse(Long id) {
        ResultMsg resultMsg = warehouseService.deleteWarehouse(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询仓库", response = Warehouse.class)
    @PostMapping("getWarehouse")
    public ResultMsg getWarehouse(@RequestBody WarehouseParam warehouseParam) {
        ResultMsg resultMsg = warehouseService.getWarehouse(warehouseParam);
        return resultMsg;
    }


}

