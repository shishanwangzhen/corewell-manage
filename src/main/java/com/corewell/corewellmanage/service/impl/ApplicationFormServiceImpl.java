package com.corewell.corewellmanage.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.corewell.corewellmanage.dao.ApplicationFormDao;
import com.corewell.corewellmanage.domain.ApplicationForm;
import com.corewell.corewellmanage.domain.request.ApplicationFormAddParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormPageParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.ApplicationFormService;
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
@Service("ApplicationFormService")
public class ApplicationFormServiceImpl implements ApplicationFormService {
    @Autowired
    private ApplicationFormDao applicationFormDao;
    @Override
    public ResultMsg addApplicationForm(ApplicationFormAddParam applicationFormAddParam) {
        applicationFormAddParam.setCreateTime(new Date());
        int result=applicationFormDao.addApplicationForm(applicationFormAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateApplicationForm(ApplicationFormUpdateParam applicationFormUpdateParam) {
        int result=applicationFormDao.updateApplicationForm(applicationFormUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteApplicationForm(Long id) {
        int result=applicationFormDao.deleteApplicationForm(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getApplicationForm(ApplicationFormParam applicationFormParam) {
        List<ApplicationForm> list=applicationFormDao.getApplicationForm(applicationFormParam);
        return ResultMsg.success(list);
    }

    @Override
    public List<ApplicationForm> selectApplicationForm(ApplicationFormPageParam applicationFormPageParam) {
        ApplicationFormParam applicationFormParam= JSONObject.parseObject(applicationFormPageParam.toString(),ApplicationFormParam.class);
        List<ApplicationForm> list=applicationFormDao.getApplicationForm(applicationFormParam);
        return list;
    }
}
