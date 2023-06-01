package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.utils.FileUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/14:46
 * @Description:
 */

@RestController
@RequestMapping("/corewell/picture/")
@Api(tags = "图片")
@Slf4j
public class PictureController {

    // 将 yml 中的自定义配置注入到这里
    @Value("${gorit.file.root.path}")
    private String filePath;


    /**
     * 上传图片
     *
     * @param file
     * @return
     */
    @ApiOperation("上传图片")
    @PostMapping("uploadPicture")
    public ResultMsg uploadPicture(@RequestParam("file") MultipartFile file) {
        try {
            String path = FileUtils.uploadFile(file, filePath);
            return ResultMsg.success(path);
        } catch (Exception e) {
            log.error(e.toString());
            return ResultMsg.error();
        }
    }

    /**
     * 下载图片
     *
     * @param path
     * @param response
     */
    @ApiOperation("下载图片")
    @GetMapping("downloadPicture")
    public void downloadPicture(@RequestParam("path") String path, HttpServletResponse response) {
        try {
            path = filePath + path;
            FileUtils.download(path, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 图片预览
     *
     * @param path
     * @param response
     * @throws IOException
     */
    @ApiOperation("预览图片")
    @GetMapping("previewPicture")
    public void previewPicture(@RequestParam("path") String path, HttpServletResponse response) throws Exception {
        try {
            path = filePath + path;
            FileUtils.preview(path, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

