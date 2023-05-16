package com.corewell.corewellmanage.dao;

import com.corewell.corewellmanage.domain.Warehouse;
import com.corewell.corewellmanage.domain.request.WarehouseAddParam;
import com.corewell.corewellmanage.domain.request.WarehouseParam;
import com.corewell.corewellmanage.domain.request.WarehouseUpdateParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/15:17
 * @Description:
 */
@Mapper
public interface WarehouseDao {
    /**
     * 添加仓库
     *
     * @param warehouseAddParam
     * @return
     */
    int addWarehouse(WarehouseAddParam warehouseAddParam);

    /**
     * 修改仓库
     *
     * @param warehouseUpdateParam
     * @return
     */
    int updateWarehouse(WarehouseUpdateParam warehouseUpdateParam);

    /**
     * 删除仓库
     *
     * @param id
     * @return
     */
    int deleteWarehouse(Long id);

    /**
     * 获取仓库列表
     *
     * @param warehouseParam
     * @return
     */
    List<Warehouse> getWarehouse(WarehouseParam warehouseParam);

}
