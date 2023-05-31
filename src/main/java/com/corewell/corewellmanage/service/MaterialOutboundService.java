package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.MaterialOutboundAddParam;
import com.corewell.corewellmanage.domain.request.MaterialOutboundParam;
import com.corewell.corewellmanage.domain.request.MaterialOutboundUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface MaterialOutboundService {

    /**
     * 添加物料出库
     *
     * @param materialOutboundAddParam
     * @return
     */
    ResultMsg addMaterialOutbound(MaterialOutboundAddParam materialOutboundAddParam);

    /**
     * 修改物料出库
     *
     * @param materialOutboundUpdateParam
     * @return
     */
    ResultMsg updateMaterialOutbound(MaterialOutboundUpdateParam materialOutboundUpdateParam);

    /**
     * 删除物料出库
     *
     * @param id
     * @return
     */
    ResultMsg deleteMaterialOutbound(Long id);

    /**
     * 获取物料出库列表
     *
     * @param materialOutboundParam
     * @return
     */
    ResultMsg getMaterialOutbound(MaterialOutboundParam materialOutboundParam);

}
