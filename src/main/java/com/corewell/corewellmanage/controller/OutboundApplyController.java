package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.OutboundApply;
import com.corewell.corewellmanage.domain.request.OutboundApplyAddParam;
import com.corewell.corewellmanage.domain.request.OutboundApplyParam;
import com.corewell.corewellmanage.domain.request.OutboundApplyUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.OutboundApplyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/14:46
 * @Description:
 */

@RestController
@RequestMapping("/corewell/outboundApply/")
@Api(tags = "出库申请")
public class OutboundApplyController {

    @Autowired
    private OutboundApplyService outboundApplyService;

    @ApiOperation(value = "添加出库申请")
    @PostMapping("addOutboundApply")
    public ResultMsg addOutboundApply(@RequestBody OutboundApplyAddParam outboundApplyAddParam) {
        ResultMsg resultMsg = outboundApplyService.addOutboundApply(outboundApplyAddParam);
        return resultMsg;
    }


    @ApiOperation("修改出库申请")
    @PostMapping("updateOutboundApply")
    public ResultMsg updateOutboundApply(@RequestBody OutboundApplyUpdateParam outboundApplyUpdateParam) {
        ResultMsg resultMsg = outboundApplyService.updateOutboundApply(outboundApplyUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除出库申请")
    @PostMapping("deleteOutboundApply")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteOutboundApply(Long id) {
        ResultMsg resultMsg = outboundApplyService.deleteOutboundApply(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询出库申请", response = OutboundApply.class)
    @PostMapping("getOutboundApply")
    public ResultMsg getOutboundApply(@RequestBody OutboundApplyParam outboundApplyParam) {
        ResultMsg resultMsg = outboundApplyService.getOutboundApply(outboundApplyParam);
        return resultMsg;
    }


}

