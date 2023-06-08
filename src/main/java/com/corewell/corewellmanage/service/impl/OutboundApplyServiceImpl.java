package com.corewell.corewellmanage.service.impl;

import com.corewell.corewellmanage.dao.OutboundApplyDao;
import com.corewell.corewellmanage.domain.OutboundApply;
import com.corewell.corewellmanage.domain.request.OutboundApplyAddParam;
import com.corewell.corewellmanage.domain.request.OutboundApplyParam;
import com.corewell.corewellmanage.domain.request.OutboundApplyUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.OutboundApplyService;
import com.corewell.corewellmanage.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/26/14:21
 * @Description:
 */
@Service("OutboundApplyService")
public class OutboundApplyServiceImpl implements OutboundApplyService {
    @Autowired
    private OutboundApplyDao outboundApplyDao;
    @Override
    public ResultMsg addOutboundApply(OutboundApplyAddParam outboundApplyAddParam) {
        outboundApplyAddParam.setCreateTime(new Date());
        String id=UUIDUtil.get32uuid();
        outboundApplyAddParam.setId(id);
        int result=outboundApplyDao.addOutboundApply(outboundApplyAddParam);
        if (result==1){
            return ResultMsg.success(id);
        }else {
            return ResultMsg.error();
        }
    }

    @Override
    public ResultMsg updateOutboundApply(OutboundApplyUpdateParam outboundApplyUpdateParam) {
        int result=outboundApplyDao.updateOutboundApply(outboundApplyUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteOutboundApply(Long id) {
        int result=outboundApplyDao.deleteOutboundApply(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getOutboundApply(OutboundApplyParam outboundApplyParam) {
        List<OutboundApply> list=outboundApplyDao.getOutboundApply(outboundApplyParam);
        return ResultMsg.success(list);
    }
}
