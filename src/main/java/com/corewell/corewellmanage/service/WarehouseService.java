package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.*;
import com.corewell.corewellmanage.domain.response.ProjectDTO;
import com.corewell.corewellmanage.domain.response.WarehouseDTO;
import com.corewell.corewellmanage.result.ResultMsg;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

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

    /**
     * 分页查询仓库
     *
     * @param warehousePageParam
     * @return
     */
    List<WarehouseDTO> selectWarehouse(WarehousePageParam warehousePageParam);

    /**
     * 导出仓库
     *
     * @param warehouseParam
     * @param response
     * @return
     */
    ResultMsg downloadWarehouse(WarehouseParam warehouseParam, HttpServletResponse response);

}
