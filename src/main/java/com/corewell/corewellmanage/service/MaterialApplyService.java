package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.MaterialApplyAddParam;
import com.corewell.corewellmanage.domain.request.MaterialApplyParam;
import com.corewell.corewellmanage.domain.request.MaterialApplyUpdateParam;
import com.corewell.corewellmanage.domain.template.MaterialApplyTemplate;
import com.corewell.corewellmanage.result.ResultMsg;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface MaterialApplyService {

    /**
     * 添加物料申请
     *
     * @param materialApplyAddParam
     * @return
     */
    ResultMsg addMaterialApply(MaterialApplyAddParam materialApplyAddParam);

    /**
     * 修改物料申请
     *
     * @param materialApplyUpdateParam
     * @return
     */
    ResultMsg updateMaterialApply(MaterialApplyUpdateParam materialApplyUpdateParam);

    /**
     * 删除物料申请
     *
     * @param id
     * @return
     */
    ResultMsg deleteMaterialApply(Long id);

    /**
     * 获取物料申请列表
     *
     * @param materialApplyParam
     * @return
     */
    ResultMsg getMaterialApply(MaterialApplyParam materialApplyParam);

    /**
     * 添加物料申请
     *
     * @param materialApplyTemplate
     * @return
     */
    ResultMsg importMaterialApply(MaterialApplyTemplate materialApplyTemplate);



}
