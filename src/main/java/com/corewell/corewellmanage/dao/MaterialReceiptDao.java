package com.corewell.corewellmanage.dao;


import com.corewell.corewellmanage.domain.MaterialReceipt;
import com.corewell.corewellmanage.domain.request.MaterialReceiptAddParam;
import com.corewell.corewellmanage.domain.request.MaterialReceiptParam;
import com.corewell.corewellmanage.domain.request.MaterialReceiptUpdateParam;
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
public interface MaterialReceiptDao {

    /**
     * 添加物料入库
     *
     * @param materialReceiptAddParam
     * @return
     */
    int addMaterialReceipt(MaterialReceiptAddParam materialReceiptAddParam);

    /**
     * 修改物料入库
     *
     * @param materialReceiptUpdateParam
     * @return
     */
    int updateMaterialReceipt(MaterialReceiptUpdateParam materialReceiptUpdateParam);

    /**
     * 删除物料入库
     *
     * @param id
     * @return
     */
    int deleteMaterialReceipt(Long id);

    /**
     * 获取物料入库列表
     *
     * @param materialReceiptParam
     * @return
     */
    List<MaterialReceipt> getMaterialReceipt(MaterialReceiptParam materialReceiptParam);

}
