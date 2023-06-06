package com.corewell.corewellmanage.service.impl;

import com.alibaba.fastjson.JSON;
import com.corewell.corewellmanage.dao.MaterialApplyDao;
import com.corewell.corewellmanage.dao.MaterialNameDao;
import com.corewell.corewellmanage.domain.MaterialApply;
import com.corewell.corewellmanage.domain.MaterialName;
import com.corewell.corewellmanage.domain.request.*;
import com.corewell.corewellmanage.domain.response.MaterialApplyDTO;
import com.corewell.corewellmanage.domain.template.MaterialApplyTemplate;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialApplyService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class MaterialApplyServiceImpl implements MaterialApplyService {
    @Autowired
    private MaterialApplyDao materialApplyDao;
    @Autowired
    private MaterialNameDao materialNameDao;
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

    @Override
    public ResultMsg importMaterialApply(MaterialApplyTemplate materialApplyTemplate) {
        MaterialApplyAddParam materialApplyAddParam=new MaterialApplyAddParam();
        MaterialName materialName=materialNameDao.getMaterialNameByName(materialApplyTemplate.getMaterialName());
        materialApplyAddParam.setMaterialId(materialName.getId());
        if (materialApplyTemplate.getCounts()!=null){
            materialApplyAddParam.setCounts(materialApplyTemplate.getCounts());
        }
        if (materialApplyTemplate.getFreight()!=null){
            materialApplyAddParam.setFreight(materialApplyTemplate.getFreight());
        }
        if (materialApplyTemplate.getLink()!=null){
            materialApplyAddParam.setLink(materialApplyTemplate.getLink());
        }
        if (materialApplyTemplate.getPrice()!=null){
            materialApplyAddParam.setPrice(materialApplyTemplate.getPrice());
        }
        if (materialApplyTemplate.getNotes()!=null){
            materialApplyAddParam.setNotes(materialApplyTemplate.getNotes());
        }
        if (materialApplyTemplate.getUnit()!=null){
            materialApplyAddParam.setUnit(materialApplyTemplate.getUnit());
        }
        materialApplyAddParam.setCreateTime(new Date());
        int result=materialApplyDao.addMaterialApply(materialApplyAddParam);
        return ResultMsg.success();
    }

    @Override
    public List<MaterialApplyDTO> selectMaterialApply(MaterialApplyPageParam materialApplyPageParam) {
        log.info("selectMaterialApply:  materialApplyParam:  " + JSON.toJSONString(materialApplyPageParam));
        List<MaterialApplyDTO> result = materialApplyDao.selectMaterialApply(materialApplyPageParam);
        return result;
    }
}
