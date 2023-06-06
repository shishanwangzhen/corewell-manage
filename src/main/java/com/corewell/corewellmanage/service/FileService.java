package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.Files;
import com.corewell.corewellmanage.domain.request.FileAddParam;
import com.corewell.corewellmanage.domain.request.FilePageParam;
import com.corewell.corewellmanage.domain.request.FileParam;
import com.corewell.corewellmanage.domain.request.FileUpdateParam;
import com.corewell.corewellmanage.domain.response.FilesDTO;
import com.corewell.corewellmanage.result.ResultMsg;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface FileService {

    /**
     * 添加文件
     *
     * @param fileAddParam
     * @return
     */
    ResultMsg addFile(FileAddParam fileAddParam);

    /**
     * 修改文件
     *
     * @param fileUpdateParam
     * @return
     */
    ResultMsg updateFile(FileUpdateParam fileUpdateParam);

    /**
     * 删除文件
     *
     * @param id
     * @return
     */
    ResultMsg deleteFile(Long id);

    /**
     * 获取文件列表
     *
     * @param fileParam
     * @return
     */
    ResultMsg getFile(FileParam fileParam);

    /**
     * 通过id查询文件
     *
     * @param id
     * @return
     */
    Files getFileById(Long id);

    /**
     * 通过id查询文件
     *
     * @param filePageParam
     * @return
     */
    List<FilesDTO> selectFile(FilePageParam filePageParam);


}
