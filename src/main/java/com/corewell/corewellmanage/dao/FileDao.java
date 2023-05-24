package com.corewell.corewellmanage.dao;

import com.corewell.corewellmanage.domain.Files;
import com.corewell.corewellmanage.domain.request.FileAddParam;
import com.corewell.corewellmanage.domain.request.FileParam;
import com.corewell.corewellmanage.domain.request.FileUpdateParam;
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
public interface FileDao {
    /**
     * 添加文件
     *
     * @param fileAddParam
     * @return
     */
    int addFile(FileAddParam fileAddParam);

    /**
     * 修改文件
     *
     * @param fileUpdateParam
     * @return
     */
    int updateFile(FileUpdateParam fileUpdateParam);

    /**
     * 删除文件
     *
     * @param id
     * @return
     */
    int deleteFile(Long id);

    /**
     * 获取文件列表
     *
     * @param fileParam
     * @return
     */
    List<Files> getFile(FileParam fileParam);


    /**
     * 通过id查询文件
     *
     * @param id
     * @return
     */
    Files getFileById(Long id);

}
