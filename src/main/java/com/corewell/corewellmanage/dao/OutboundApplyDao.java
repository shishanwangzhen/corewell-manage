package com.corewell.corewellmanage.dao;


import com.corewell.corewellmanage.domain.OutboundApply;
import com.corewell.corewellmanage.domain.request.OutboundApplyAddParam;
import com.corewell.corewellmanage.domain.request.OutboundApplyParam;
import com.corewell.corewellmanage.domain.request.OutboundApplyUpdateParam;
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
public interface OutboundApplyDao {

    /**
     * 添加出库申请
     *
     * @param outboundApplyAddParam
     * @return
     */
    int addOutboundApply(OutboundApplyAddParam outboundApplyAddParam);

    /**
     * 修改出库申请
     *
     * @param outboundApplyUpdateParam
     * @return
     */
    int updateOutboundApply(OutboundApplyUpdateParam outboundApplyUpdateParam);

    /**
     * 删除出库申请
     *
     * @param id
     * @return
     */
    int deleteOutboundApply(Long id);

    /**
     * 获取出库申请列表
     *
     * @param outboundApplyParam
     * @return
     */
    List<OutboundApply> getOutboundApply(OutboundApplyParam outboundApplyParam);

}
