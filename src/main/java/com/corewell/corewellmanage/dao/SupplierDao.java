package com.corewell.corewellmanage.dao;


import com.corewell.corewellmanage.domain.Supplier;
import com.corewell.corewellmanage.domain.request.SupplierAddParam;
import com.corewell.corewellmanage.domain.request.SupplierParam;
import com.corewell.corewellmanage.domain.request.SupplierUpdateParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
@Mapper
public interface SupplierDao {

    /**
     * 添加供应商
     *
     * @param supplierAddParam
     * @return
     */
    int addSupplier(SupplierAddParam supplierAddParam);

    /**
     * 修改供应商
     *
     * @param supplierUpdateParam
     * @return
     */
    int updateSupplier(SupplierUpdateParam supplierUpdateParam);

    /**
     * 删除供应商
     *
     * @param id
     * @return
     */
    int deleteSupplier(Long id);

    /**
     * 获取供应商列表
     *
     * @param supplierParam
     * @return
     */
    List<Supplier> getSupplier(SupplierParam supplierParam);

}
