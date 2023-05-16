package com.corewell.corewellmanage.service.impl;

import com.corewell.corewellmanage.dao.WarehouseDao;
import com.corewell.corewellmanage.domain.Warehouse;
import com.corewell.corewellmanage.domain.request.*;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/15/13:43
 * @Description:
 */
@Service("WarehouseService")
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    private WarehouseDao warehouseDao;

    @Override
    public ResultMsg addWarehouse(WarehouseAddParam warehouseAddParam) {
        warehouseAddParam.setCreateTime(new Date());
        int result =warehouseDao.addWarehouse(warehouseAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateWarehouse(WarehouseUpdateParam warehouseUpdateParam) {
        int result=warehouseDao.updateWarehouse(warehouseUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteWarehouse(Long id) {
        int result=warehouseDao.deleteWarehouse(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getWarehouse(WarehouseParam warehouseParam) {
        List<Warehouse> list=warehouseDao.getWarehouse(warehouseParam);
        return ResultMsg.success(list);
    }
}
