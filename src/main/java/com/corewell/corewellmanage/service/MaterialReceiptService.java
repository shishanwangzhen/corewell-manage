package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.MaterialReceiptAddParam;
import com.corewell.corewellmanage.domain.request.MaterialReceiptParam;
import com.corewell.corewellmanage.domain.request.MaterialReceiptUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface MaterialReceiptService {

    /**
     * 添加物料入库
     *
     * @param materialReceiptAddParam
     * @return
     */
    ResultMsg addMaterialReceipt(MaterialReceiptAddParam materialReceiptAddParam);

    /**
     * 修改物料入库
     *
     * @param materialReceiptUpdateParam
     * @return
     */
    ResultMsg updateMaterialReceipt(MaterialReceiptUpdateParam materialReceiptUpdateParam);

    /**
     * 删除物料入库
     *
     * @param id
     * @return
     */
    ResultMsg deleteMaterialReceipt(Long id);

    /**
     * 获取物料入库列表
     *
     * @param materialReceiptParam
     * @return
     */
    ResultMsg getMaterialReceipt(MaterialReceiptParam materialReceiptParam);

}
