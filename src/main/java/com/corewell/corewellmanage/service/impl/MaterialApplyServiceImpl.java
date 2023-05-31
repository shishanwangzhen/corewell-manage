package com.corewell.corewellmanage.service.impl;

import com.corewell.corewellmanage.dao.MaterialApplyDao;
import com.corewell.corewellmanage.domain.MaterialApply;
import com.corewell.corewellmanage.domain.request.MaterialApplyAddParam;
import com.corewell.corewellmanage.domain.request.MaterialApplyParam;
import com.corewell.corewellmanage.domain.request.MaterialApplyUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialApplyService;
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
@Service("MaterialApplyService")
public class MaterialApplyServiceImpl implements MaterialApplyService {
    @Autowired
    private MaterialApplyDao materialApplyDao;
    @Override
    public ResultMsg addMaterialApply(MaterialApplyAddParam materialApplyAddParam) {
        materialApplyAddParam.setCreateTime(new Date());
        int result=materialApplyDao.addMaterialApply(materialApplyAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateMaterialApply(MaterialApplyUpdateParam materialApplyUpdateParam) {
        int result=materialApplyDao.updateMaterialApply(materialApplyUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteMaterialApply(Long id) {
        int result=materialApplyDao.deleteMaterialApply(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getMaterialApply(MaterialApplyParam materialApplyParam) {
        List<MaterialApply> list=materialApplyDao.getMaterialApply(materialApplyParam);
        return ResultMsg.success(list);
    }
}
