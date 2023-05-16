package com.corewell.corewellmanage.dao;

import com.corewell.corewellmanage.domain.File;
import com.corewell.corewellmanage.domain.Project;
import com.corewell.corewellmanage.domain.request.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/15:17
 * @Description:
 */
@Mapper
public interface ProjectDao {
    /**
     * 添加项目
     *
     * @param projectAddParam
     * @return
     */
    int addProject(ProjectAddParam projectAddParam);

    /**
     * 修改项目
     *
     * @param projectUpdateParam
     * @return
     */
    int updateProject(ProjectUpdateParam projectUpdateParam);

    /**
     * 删除项目
     *
     * @param id
     * @return
     */
    int deleteProject(Long id);

    /**
     * 获取项目列表
     *
     * @param projectParam
     * @return
     */
    List<Project> getProject(ProjectParam projectParam);

}
