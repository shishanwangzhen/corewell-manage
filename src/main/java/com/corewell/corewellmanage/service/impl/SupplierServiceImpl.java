package com.corewell.corewellmanage.service.impl;

import com.corewell.corewellmanage.dao.SupplierDao;
import com.corewell.corewellmanage.domain.Supplier;
import com.corewell.corewellmanage.domain.request.SupplierAddParam;
import com.corewell.corewellmanage.domain.request.SupplierParam;
import com.corewell.corewellmanage.domain.request.SupplierUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/26/14:20
 * @Description:
 */
@Service("SupplierService")
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierDao supplierDao;
    @Override
    public ResultMsg addSupplier(SupplierAddParam supplierAddParam) {
        int result=supplierDao.addSupplier(supplierAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateSupplier(SupplierUpdateParam supplierUpdateParam) {
        int result=supplierDao.updateSupplier(supplierUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteSupplier(Long id) {
        int result=supplierDao.deleteSupplier(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getSupplier(SupplierParam supplierParam) {
        List<Supplier> list=supplierDao.getSupplier(supplierParam);
        return ResultMsg.success(list);
    }
}
