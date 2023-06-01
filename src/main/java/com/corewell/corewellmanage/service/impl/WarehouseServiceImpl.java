package com.corewell.corewellmanage.service.impl;

import com.alibaba.fastjson.JSON;
import com.corewell.corewellmanage.dao.WarehouseDao;
import com.corewell.corewellmanage.domain.Warehouse;
import com.corewell.corewellmanage.domain.request.*;
import com.corewell.corewellmanage.domain.response.WarehouseDTO;
import com.corewell.corewellmanage.domain.template.WarehouseTemplate;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.WarehouseService;
import com.corewell.corewellmanage.utils.ExcelUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
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
@Slf4j
public class WarehouseServiceImpl implements WarehouseService {
    private static final String fileName = "仓库列表";
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


    @Override
    public List<WarehouseDTO> selectWarehouse(WarehousePageParam warehousePageParam) {
        log.info("selectAccounts:  accountParam:  " + JSON.toJSONString(warehousePageParam));
        WarehouseParam warehouseParam = new WarehouseParam();
        warehouseParam.setManagerId(warehousePageParam.getManagerId());
        warehouseParam.setCreatorId(warehousePageParam.getCreatorId());
        warehouseParam.setName(warehousePageParam.getName());
        List<WarehouseDTO> result = warehouseDao.selectWarehouse(warehouseParam);
        return result;
    }

    @Override
    public ResultMsg downloadWarehouse(WarehouseParam warehouseParam, HttpServletResponse response) {
        log.info("downloadWarehouse:  warehouseParam:  " + JSON.toJSONString(warehouseParam));
        List<WarehouseTemplate> list = warehouseDao.downloadWarehouse(warehouseParam);
        try {
            ExcelUtil.writeExcel(response, list, fileName, fileName, WarehouseTemplate.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultMsg.success();
    }
}
