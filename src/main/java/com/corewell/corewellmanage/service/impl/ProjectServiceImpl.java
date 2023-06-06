package com.corewell.corewellmanage.service.impl;

import com.alibaba.fastjson.JSON;
import com.corewell.corewellmanage.dao.ProjectDao;
import com.corewell.corewellmanage.domain.Project;
import com.corewell.corewellmanage.domain.request.ProjectAddParam;
import com.corewell.corewellmanage.domain.request.ProjectPageParam;
import com.corewell.corewellmanage.domain.request.ProjectParam;
import com.corewell.corewellmanage.domain.request.ProjectUpdateParam;
import com.corewell.corewellmanage.domain.response.ProjectDTO;
import com.corewell.corewellmanage.domain.template.ProjectTemplate;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.ProjectService;
import com.corewell.corewellmanage.utils.ExcelUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/15/13:42
 * @Description:
 */
@Service("ProjectService")
@Slf4j
public class ProjectServiceImpl implements ProjectService {

    private static final String fileName = "项目列表.xlsx";
    private static final String sheetName="项目列表";
    @Autowired
    private ProjectDao projectDao;

    @Override
    public ResultMsg addProject(ProjectAddParam projectAddParam) {
        int result = projectDao.addProject(projectAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateProject(ProjectUpdateParam projectUpdateParam) {

        int result = projectDao.updateProject(projectUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteProject(Long id) {
        int result = projectDao.deleteProject(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getProject(ProjectParam projectParam) {
        List<Project> list = projectDao.getProject(projectParam);
        return ResultMsg.success(list);
    }

    @Override
    public List<ProjectDTO> selectProject(ProjectPageParam projectPageParam) {
        log.info("selectAccounts:  accountParam:  " + JSON.toJSONString(projectPageParam));
        ProjectParam projectParam = new ProjectParam();
        projectParam.setManagerId(projectPageParam.getManagerId());
        projectParam.setCreatorId(projectPageParam.getCreatorId());
        projectParam.setName(projectPageParam.getName());
        List<ProjectDTO> result = projectDao.selectProject(projectParam);
        return result;
    }

    @Override
    public ResultMsg downloadProject(ProjectParam projectParam, HttpServletResponse response) {
        log.info("downloadProject:  projectParam:  " + JSON.toJSONString(projectParam));
        List<ProjectTemplate> list = projectDao.downloadProject(projectParam);
        try {
            ExcelUtil.writeExcel(response, list, fileName, sheetName, ProjectTemplate.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultMsg.success();
    }
}
