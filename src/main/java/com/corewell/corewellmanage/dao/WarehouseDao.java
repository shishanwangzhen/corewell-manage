package com.corewell.corewellmanage.dao;

import com.corewell.corewellmanage.domain.Warehouse;
import com.corewell.corewellmanage.domain.request.*;
import com.corewell.corewellmanage.domain.response.WarehouseDTO;
import com.corewell.corewellmanage.domain.template.AccountTemplate;
import com.corewell.corewellmanage.domain.template.WarehouseTemplate;
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

    /**
     * 获取项目分页列表
     *
     * @param warehousePageParam
     * @return
     */
    List<WarehouseDTO> selectWarehouse(WarehousePageParam warehousePageParam);

    /**
     * 获取仓库导出列表
     *
     * @param warehouseParam
     * @return
     */
    List<WarehouseTemplate> downloadWarehouse(WarehouseParam warehouseParam);

}
