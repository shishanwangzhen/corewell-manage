package com.corewell.corewellmanage.service.impl;

import com.alibaba.fastjson.JSON;
import com.corewell.corewellmanage.dao.FileDao;
import com.corewell.corewellmanage.domain.Account;
import com.corewell.corewellmanage.domain.File;
import com.corewell.corewellmanage.domain.request.FileAddParam;
import com.corewell.corewellmanage.domain.request.FileParam;
import com.corewell.corewellmanage.domain.request.FileUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/08/13:56
 * @Description:
 */
@Service("FileService")
@Slf4j
public class FileServiceImpl implements FileService {
    @Autowired
    private FileDao fileDao;


    @Override
    public ResultMsg addFile(FileAddParam fileAddParam) {

        fileAddParam.setCreateTime(new Date());
        int result=fileDao.addFile(fileAddParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg updateFile(FileUpdateParam fileUpdateParam) {
        int result=fileDao.updateFile(fileUpdateParam);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg deleteFile(Long id) {
        int result=fileDao.deleteFile(id);
        return ResultMsg.success();
    }

    @Override
    public ResultMsg getFile(FileParam fileParam) {
        log.info("getAccount:  accountParam:  " + JSON.toJSONString(fileParam));
        List<File> result=fileDao.getFile(fileParam);
        return ResultMsg.success(result);
    }
}
