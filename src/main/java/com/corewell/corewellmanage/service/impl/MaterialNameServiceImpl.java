package com.corewell.corewellmanage.service.impl;

import com.corewell.corewellmanage.dao.MaterialNameDao;
import com.corewell.corewellmanage.domain.MaterialName;
import com.corewell.corewellmanage.domain.request.MaterialNameAddParam;
import com.corewell.corewellmanage.domain.request.MaterialNameParam;
import com.corewell.corewellmanage.domain.request.MaterialNameUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialNameService;
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
@Service("MaterialNameService")
public class MaterialNameServiceImpl implements MaterialNameService {
    @Autowired
    private MaterialNameDao materialNameDao;
    @Override
    public ResultMsg addMaterialName(MaterialNameAddParam materialNameAddParam) {
        materialNameAddParam.setCreateTime(new Date());
        int result=materialNameDao.addMaterialName(materialNameAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateMaterialName(MaterialNameUpdateParam materialNameUpdateParam) {
        int result=materialNameDao.updateMaterialName(materialNameUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteMaterialName(Long id) {
        int result=materialNameDao.deleteMaterialName(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getMaterialName(MaterialNameParam materialNameParam) {
        List<MaterialName> list=materialNameDao.getMaterialName(materialNameParam);
        return ResultMsg.success(list);
    }
}
