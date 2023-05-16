package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.domain.File;
import com.corewell.corewellmanage.domain.request.FileAddParam;
import com.corewell.corewellmanage.domain.request.FileParam;
import com.corewell.corewellmanage.domain.request.FileUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.FileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/14:46
 * @Description:
 */

@RestController
@RequestMapping("/corewell/file/")
@Api(tags = "文件")
public class FileController {

    @Autowired
    private FileService fileService;

    @ApiOperation(value = "添加文件")
    @PostMapping("addFile")
    public ResultMsg addFile(@RequestBody FileAddParam fileAddParam) {
        ResultMsg resultMsg = fileService.addFile(fileAddParam);
        return resultMsg;
    }


    @ApiOperation("修改文件")
    @PostMapping("updateFile")
    public ResultMsg updateFile(@RequestBody FileUpdateParam fileUpdateParam) {
        ResultMsg resultMsg = fileService.updateFile(fileUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除文件")
    @PostMapping("deleteFile")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteFile(Long id) {
        ResultMsg resultMsg = fileService.deleteFile(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询文件", response = File.class)
    @PostMapping("getFile")
    public ResultMsg getFile(@RequestBody FileParam fileParam) {
        ResultMsg resultMsg = fileService.getFile(fileParam);
        return resultMsg;
    }


}

