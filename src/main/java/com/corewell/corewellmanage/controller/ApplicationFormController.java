package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.request.ApplicationFormAddParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormPageParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormUpdateParam;
import com.corewell.corewellmanage.domain.response.ApplicationFormDTO;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.ApplicationFormService;
import com.corewell.corewellmanage.utils.PageUtil;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/14:46
 * @Description:
 */

@RestController
@RequestMapping("/corewell/applicationForm/")
@Api(tags = "提单申请")
public class ApplicationFormController {

    @Autowired
    private ApplicationFormService applicationFormService;

    @ApiOperation(value = "添加提单申请")
    @PostMapping("addApplicationForm")
    public ResultMsg addApplicationForm(@RequestBody ApplicationFormAddParam applicationFormAddParam) {
        ResultMsg resultMsg = applicationFormService.addApplicationForm(applicationFormAddParam);
        return resultMsg;
    }


    @ApiOperation("修改提单申请")
    @PostMapping("updateApplicationForm")
    public ResultMsg updateApplicationForm(@RequestBody ApplicationFormUpdateParam applicationFormUpdateParam) {
        ResultMsg resultMsg = applicationFormService.updateApplicationForm(applicationFormUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除提单申请")
    @PostMapping("deleteApplicationForm")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteApplicationForm(Long id) {
        ResultMsg resultMsg = applicationFormService.deleteApplicationForm(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询提单申请", response = ApplicationFormDTO.class)
    @PostMapping("getApplicationForm")
    public ResultMsg getApplicationForm(@RequestBody ApplicationFormParam applicationFormParam) {
        ResultMsg resultMsg = applicationFormService.getApplicationForm(applicationFormParam);
        return resultMsg;
    }

    @ApiOperation(value = "分页查询提单申请", response = ApplicationFormDTO.class)
    @PostMapping("selectApplicationForm")
    public ResultMsg selectApplicationForm(@RequestBody ApplicationFormPageParam applicationFormPageParam) {
        PageUtil.setPageParams(applicationFormPageParam.getPageParam());
        List<ApplicationFormDTO> list = applicationFormService.selectApplicationForm(applicationFormPageParam);
        PageInfo<ApplicationFormDTO> pageInfo = new PageInfo(list);
        return ResultMsg.success(pageInfo);
    }


}

