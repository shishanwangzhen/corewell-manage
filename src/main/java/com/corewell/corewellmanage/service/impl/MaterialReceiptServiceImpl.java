package com.corewell.corewellmanage.service.impl;

import com.corewell.corewellmanage.dao.MaterialReceiptDao;
import com.corewell.corewellmanage.domain.MaterialReceipt;
import com.corewell.corewellmanage.domain.request.MaterialReceiptAddParam;
import com.corewell.corewellmanage.domain.request.MaterialReceiptParam;
import com.corewell.corewellmanage.domain.request.MaterialReceiptUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialReceiptService;
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
@Service("MaterialReceiptService")
public class MaterialReceiptServiceImpl implements MaterialReceiptService {
    @Autowired
    private MaterialReceiptDao materialReceiptDao;
    @Override
    public ResultMsg addMaterialReceipt(MaterialReceiptAddParam materialReceiptAddParam) {
        materialReceiptAddParam.setCreateTime(new Date());
        int result=materialReceiptDao.addMaterialReceipt(materialReceiptAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateMaterialReceipt(MaterialReceiptUpdateParam materialReceiptUpdateParam) {
        int result=materialReceiptDao.updateMaterialReceipt(materialReceiptUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteMaterialReceipt(Long id) {
        int result=materialReceiptDao.deleteMaterialReceipt(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getMaterialReceipt(MaterialReceiptParam materialReceiptParam) {
        List<MaterialReceipt> list=materialReceiptDao.getMaterialReceipt(materialReceiptParam);
        return ResultMsg.success(list);
    }
}
