package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.Supplier;
import com.corewell.corewellmanage.domain.request.SupplierAddParam;
import com.corewell.corewellmanage.domain.request.SupplierParam;
import com.corewell.corewellmanage.domain.request.SupplierUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.SupplierService;
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
@RequestMapping("/corewell/supplier/")
@Api(tags = "供应商")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @ApiOperation(value = "添加供应商")
    @PostMapping("addSupplier")
    public ResultMsg addSupplier(@RequestBody SupplierAddParam supplierAddParam) {
        ResultMsg resultMsg = supplierService.addSupplier(supplierAddParam);
        return resultMsg;
    }


    @ApiOperation("修改供应商")
    @PostMapping("updateSupplier")
    public ResultMsg updateSupplier(@RequestBody SupplierUpdateParam supplierUpdateParam) {
        ResultMsg resultMsg = supplierService.updateSupplier(supplierUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除供应商")
    @PostMapping("deleteSupplier")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteSupplier(Long id) {
        ResultMsg resultMsg = supplierService.deleteSupplier(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询供应商", response = Supplier.class)
    @PostMapping("getSupplier")
    public ResultMsg getSupplier(@RequestBody SupplierParam supplierParam) {
        ResultMsg resultMsg = supplierService.getSupplier(supplierParam);
        return resultMsg;
    }


}

