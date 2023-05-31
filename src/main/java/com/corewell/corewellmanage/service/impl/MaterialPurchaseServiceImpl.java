package com.corewell.corewellmanage.service.impl;

import com.corewell.corewellmanage.dao.MaterialPurchaseDao;
import com.corewell.corewellmanage.domain.MaterialPurchase;
import com.corewell.corewellmanage.domain.request.MaterialPurchaseAddParam;
import com.corewell.corewellmanage.domain.request.MaterialPurchaseParam;
import com.corewell.corewellmanage.domain.request.MaterialPurchaseUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialPurchaseService;
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
@Service("MaterialPurchaseService")
public class MaterialPurchaseServiceImpl implements MaterialPurchaseService {
    @Autowired
    private MaterialPurchaseDao materialPurchaseDao;
    @Override
    public ResultMsg addMaterialPurchase(MaterialPurchaseAddParam materialPurchaseAddParam) {
        materialPurchaseAddParam.setCreateTime(new Date());
        int result=materialPurchaseDao.addMaterialPurchase(materialPurchaseAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateMaterialPurchase(MaterialPurchaseUpdateParam materialPurchaseUpdateParam) {
        int result=materialPurchaseDao.updateMaterialPurchase(materialPurchaseUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteMaterialPurchase(Long id) {
        int result=materialPurchaseDao.deleteMaterialPurchase(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getMaterialPurchase(MaterialPurchaseParam materialPurchaseParam) {
        List<MaterialPurchase> list=materialPurchaseDao.getMaterialPurchase(materialPurchaseParam);
        return ResultMsg.success(list);
    }
}
