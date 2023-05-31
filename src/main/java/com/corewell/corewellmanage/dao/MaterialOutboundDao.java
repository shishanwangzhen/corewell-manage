package com.corewell.corewellmanage.dao;


import com.corewell.corewellmanage.domain.MaterialOutbound;
import com.corewell.corewellmanage.domain.request.MaterialOutboundAddParam;
import com.corewell.corewellmanage.domain.request.MaterialOutboundParam;
import com.corewell.corewellmanage.domain.request.MaterialOutboundUpdateParam;
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
public interface MaterialOutboundDao {

    /**
     * 添加物料出库
     *
     * @param materialOutboundAddParam
     * @return
     */
    int addMaterialOutbound(MaterialOutboundAddParam materialOutboundAddParam);

    /**
     * 修改物料出库
     *
     * @param materialOutboundUpdateParam
     * @return
     */
    int updateMaterialOutbound(MaterialOutboundUpdateParam materialOutboundUpdateParam);

    /**
     * 删除物料出库
     *
     * @param id
     * @return
     */
    int deleteMaterialOutbound(Long id);

    /**
     * 获取物料出库列表
     *
     * @param materialOutboundParam
     * @return
     */
    List<MaterialOutbound> getMaterialOutbound(MaterialOutboundParam materialOutboundParam);

}
