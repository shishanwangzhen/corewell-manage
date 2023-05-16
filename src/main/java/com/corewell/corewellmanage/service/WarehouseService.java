package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.WarehouseAddParam;
import com.corewell.corewellmanage.domain.request.WarehouseParam;
import com.corewell.corewellmanage.domain.request.WarehouseUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface WarehouseService {

    /**
     * 添加仓库
     *
     * @param warehouseAddParam
     * @return
     */
    ResultMsg addWarehouse(WarehouseAddParam warehouseAddParam);

    /**
     * 修改仓库
     *
     * @param warehouseUpdateParam
     * @return
     */
    ResultMsg updateWarehouse(WarehouseUpdateParam warehouseUpdateParam);

    /**
     * 删除仓库
     *
     * @param id
     * @return
     */
    ResultMsg deleteWarehouse(Long id);

    /**
     * 获取仓库列表
     *
     * @param warehouseParam
     * @return
     */
    ResultMsg getWarehouse(WarehouseParam warehouseParam);

}
