package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.Account;
import com.corewell.corewellmanage.domain.request.*;
import com.corewell.corewellmanage.domain.response.ProjectDTO;
import com.corewell.corewellmanage.result.ResultMsg;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface ProjectService {

    /**
     * 添加项目
     *
     * @param projectAddParam
     * @return
     */
    ResultMsg addProject(ProjectAddParam projectAddParam);

    /**
     * 修改项目
     *
     * @param projectUpdateParam
     * @return
     */
    ResultMsg updateProject(ProjectUpdateParam projectUpdateParam);

    /**
     * 删除项目
     *
     * @param id
     * @return
     */
    ResultMsg deleteProject(Long id);

    /**
     * 获取项目列表
     *
     * @param projectParam
     * @return
     */
    ResultMsg getProject(ProjectParam projectParam);

    /**
     * 分页查询项目
     *
     * @param projectPageParam
     * @return
     */
    List<ProjectDTO> selectProject(ProjectPageParam projectPageParam);

    /**
     * 导出账号
     *
     * @param projectParam
     * @param response
     * @return
     */
    ResultMsg downloadProject(ProjectParam projectParam, HttpServletResponse response);

}
