package com.corewell.corewellmanage.service.impl;

import com.corewell.corewellmanage.dao.ProjectDao;
import com.corewell.corewellmanage.domain.Project;
import com.corewell.corewellmanage.domain.request.ProjectAddParam;
import com.corewell.corewellmanage.domain.request.ProjectParam;
import com.corewell.corewellmanage.domain.request.ProjectUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/15/13:42
 * @Description:
 */
@Service("ProjectService")
public class ProjectServiceImpl implements ProjectService {
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
        List<Project> list=projectDao.getProject(projectParam);
        return ResultMsg.success(list);
    }
}
