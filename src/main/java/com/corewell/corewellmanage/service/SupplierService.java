package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.SupplierAddParam;
import com.corewell.corewellmanage.domain.request.SupplierParam;
import com.corewell.corewellmanage.domain.request.SupplierUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface SupplierService {

    /**
     * 添加供应商
     *
     * @param supplierAddParam
     * @return
     */
    ResultMsg addSupplier(SupplierAddParam supplierAddParam);

    /**
     * 修改供应商
     *
     * @param supplierUpdateParam
     * @return
     */
    ResultMsg updateSupplier(SupplierUpdateParam supplierUpdateParam);

    /**
     * 删除供应商
     *
     * @param id
     * @return
     */
    ResultMsg deleteSupplier(Long id);

    /**
     * 获取供应商列表
     *
     * @param supplierParam
     * @return
     */
    ResultMsg getSupplier(SupplierParam supplierParam);

}
