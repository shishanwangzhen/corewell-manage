package com.corewell.corewellmanage.dao;


import com.corewell.corewellmanage.domain.MaterialPurchase;
import com.corewell.corewellmanage.domain.request.MaterialPurchaseAddParam;
import com.corewell.corewellmanage.domain.request.MaterialPurchaseParam;
import com.corewell.corewellmanage.domain.request.MaterialPurchaseUpdateParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
@Mapper
public interface MaterialPurchaseDao {

    /**
     * 添加物料采购
     *
     * @param materialPurchaseAddParam
     * @return
     */
    int addMaterialPurchase(MaterialPurchaseAddParam materialPurchaseAddParam);

    /**
     * 修改物料采购
     *
     * @param materialPurchaseUpdateParam
     * @return
     */
    int updateMaterialPurchase(MaterialPurchaseUpdateParam materialPurchaseUpdateParam);

    /**
     * 删除物料采购
     *
     * @param id
     * @return
     */
    int deleteMaterialPurchase(Long id);

    /**
     * 获取物料采购列表
     *
     * @param materialPurchaseParam
     * @return
     */
    List<MaterialPurchase> getMaterialPurchase(MaterialPurchaseParam materialPurchaseParam);

}
