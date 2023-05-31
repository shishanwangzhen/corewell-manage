package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.Account;
import com.corewell.corewellmanage.domain.Project;
import com.corewell.corewellmanage.domain.request.*;
import com.corewell.corewellmanage.domain.response.ProjectDTO;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.ProjectService;
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

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/14:46
 * @Description:
 */

@RestController
@RequestMapping("/corewell/project/")
@Api(tags = "项目")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @ApiOperation(value = "添加项目")
    @PostMapping("addProject")
    public ResultMsg addProject(@RequestBody ProjectAddParam projectAddParam) {
        ResultMsg resultMsg = projectService.addProject(projectAddParam);
        return resultMsg;
    }


    @ApiOperation("修改项目")
    @PostMapping("updateProject")
    public ResultMsg updateProject(@RequestBody ProjectUpdateParam projectUpdateParam) {
        ResultMsg resultMsg = projectService.updateProject(projectUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除项目")
    @PostMapping("deleteProject")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteProject(Long id) {
        ResultMsg resultMsg = projectService.deleteProject(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询项目", response = Project.class)
    @PostMapping("getProject")
    public ResultMsg getProject(@RequestBody ProjectParam projectParam) {
        ResultMsg resultMsg = projectService.getProject(projectParam);
        return resultMsg;
    }

    @ApiOperation(value = "导出项目")
    @PostMapping("downloadProject")
    public ResultMsg downloadProject(@RequestBody ProjectParam projectParam, HttpServletResponse response) {
        ResultMsg resultMsg = projectService.downloadProject(projectParam,response);
        return resultMsg;
    }

    @ApiOperation(value = "分页查询项目", response = ProjectDTO.class)
    @PostMapping("selectProject")
    public ResultMsg selectProject(@RequestBody ProjectPageParam projectPageParam) {
        PageUtil.setPageParams(projectPageParam.getPageParam());
        List<ProjectDTO> list= projectService.selectProject(projectPageParam);
        PageInfo<Account> pageInfo = new PageInfo(list);
        return ResultMsg.success(pageInfo);
    }

}

