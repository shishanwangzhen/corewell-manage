package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.OutboundApplyAddParam;
import com.corewell.corewellmanage.domain.request.OutboundApplyParam;
import com.corewell.corewellmanage.domain.request.OutboundApplyUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface OutboundApplyService {

    /**
     * 添加出库申请
     *
     * @param outboundApplyAddParam
     * @return
     */
    ResultMsg addOutboundApply(OutboundApplyAddParam outboundApplyAddParam);

    /**
     * 修改出库申请
     *
     * @param outboundApplyUpdateParam
     * @return
     */
    ResultMsg updateOutboundApply(OutboundApplyUpdateParam outboundApplyUpdateParam);

    /**
     * 删除出库申请
     *
     * @param id
     * @return
     */
    ResultMsg deleteOutboundApply(Long id);

    /**
     * 获取出库申请列表
     *
     * @param outboundApplyParam
     * @return
     */
    ResultMsg getOutboundApply(OutboundApplyParam outboundApplyParam);

}
