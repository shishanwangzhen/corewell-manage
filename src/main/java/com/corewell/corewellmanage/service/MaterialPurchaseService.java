package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.MaterialPurchaseAddParam;
import com.corewell.corewellmanage.domain.request.MaterialPurchaseParam;
import com.corewell.corewellmanage.domain.request.MaterialPurchaseUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface MaterialPurchaseService {

    /**
     * 添加物料采购
     *
     * @param materialPurchaseAddParam
     * @return
     */
    ResultMsg addMaterialPurchase(MaterialPurchaseAddParam materialPurchaseAddParam);

    /**
     * 修改物料采购
     *
     * @param materialPurchaseUpdateParam
     * @return
     */
    ResultMsg updateMaterialPurchase(MaterialPurchaseUpdateParam materialPurchaseUpdateParam);

    /**
     * 删除物料采购
     *
     * @param id
     * @return
     */
    ResultMsg deleteMaterialPurchase(Long id);

    /**
     * 获取物料采购列表
     *
     * @param materialPurchaseParam
     * @return
     */
    ResultMsg getMaterialPurchase(MaterialPurchaseParam materialPurchaseParam);

}
