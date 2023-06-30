package com.corewell.corewellmanage.service.impl;

import com.corewell.corewellmanage.dao.MaterialOutboundDao;
import com.corewell.corewellmanage.domain.MaterialOutbound;
import com.corewell.corewellmanage.domain.request.MaterialOutboundAddParam;
import com.corewell.corewellmanage.domain.request.MaterialOutboundByIds;
import com.corewell.corewellmanage.domain.request.MaterialOutboundParam;
import com.corewell.corewellmanage.domain.request.MaterialOutboundUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialOutboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/26/14:21
 * @Description:
 */
@Service("MaterialOutboundService")
public class MaterialOutboundServiceImpl implements MaterialOutboundService {
    @Autowired
    private MaterialOutboundDao materialOutboundDao;
    @Override
    public ResultMsg addMaterialOutbound(MaterialOutboundAddParam materialOutboundAddParam) {
        materialOutboundAddParam.setCreateTime(new Date());
        int result=materialOutboundDao.addMaterialOutbound(materialOutboundAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateMaterialOutbound(MaterialOutboundUpdateParam materialOutboundUpdateParam) {
        int result=materialOutboundDao.updateMaterialOutbound(materialOutboundUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteMaterialOutbound(Long id) {
        int result=materialOutboundDao.deleteMaterialOutbound(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getMaterialOutbound(MaterialOutboundParam materialOutboundParam) {
        List<MaterialOutbound> list=materialOutboundDao.getMaterialOutbound(materialOutboundParam);
        return ResultMsg.success(list);
    }

    @Override
    public ResultMsg updateMaterialOutboundByIds(MaterialOutboundByIds materialOutboundByIds) {

        int result=materialOutboundDao.updateMaterialOutboundByIds(materialOutboundByIds);
        return ResultMsg.success();
    }
}
