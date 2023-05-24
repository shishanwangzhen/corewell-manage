package com.corewell.corewellmanage.controller;

import com.corewell.corewellmanage.config.UserRequest;
import com.corewell.corewellmanage.domain.Files;
import com.corewell.corewellmanage.domain.request.FileAddParam;
import com.corewell.corewellmanage.domain.request.FileParam;
import com.corewell.corewellmanage.domain.request.FileUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.FileService;
import com.corewell.corewellmanage.utils.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

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

    // 将 yml 中的自定义配置注入到这里
    @Value("${gorit.file.root.path}")
    private String filePath;
    // 日志打印
    private Logger log = LoggerFactory.getLogger("FileController");
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
    public ResultMsg deleteFile(@RequestParam("id") Long id) {
        Files userFile = fileService.getFileById(id);
        String realPath = filePath + userFile.getPath();
        File file = new File(realPath);
        if (file.exists()) {//文件是否存在
            file.delete(); //存在就删了，返回1
        }
        ResultMsg resultMsg = fileService.deleteFile(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询文件", response = Files.class)
    @PostMapping("getFile")
    public ResultMsg getFile(@RequestBody FileParam fileParam) {
        ResultMsg resultMsg = fileService.getFile(fileParam);
        return resultMsg;
    }


    // 文件上传 （可以多文件上传）
  /*  @ApiOperation("文件上传")
    @PostMapping("/upload")
    public ResultMsg fileUploads(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws IOException {
        // 得到格式化后的日期
        String format = sdf.format(new Date());
        // 获取上传的文件名称
        String fileName = file.getOriginalFilename();
        // 时间 和 日期拼接
        String newFileName = format + "_" + fileName;
        // 得到文件保存的位置以及新文件名
        File dest = new File(filePath + newFileName);
        try {
            // 上传的文件被保存了
            file.transferTo(dest);
            // 打印日志
            log.info("上传成功，当前上传的文件保存在 {}",filePath + newFileName);
            // 自定义返回的统一的 JSON 格式的数据，可以直接返回这个字符串也是可以的。
            return ResultMsg.success("上传成功");
        } catch (IOException e) {
            log.error(e.toString());
        }
        // 待完成 —— 文件类型校验工作
        return ResultMsg.error(101,"上传错误");
    }*/


    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    @ApiOperation("上传文件")
    @PostMapping("upload")
    public ResultMsg uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("projectId") Long projectId) {
        try {

            String token = UserRequest.getCurrentToken();
            Map<String, Object> map = JwtUtil.getInfo(token);

            String fileName = file.getOriginalFilename();
          /*  String extension = FilenameUtils.getExtension(fileName);
            long size = file.getSize();
            String type = file.getContentType();*/
            // 根据日期生成目录
            String localContainer = "/fileContainer";
            String uploadPath = filePath + localContainer;

            //String uploadPath = ResourceUtils.getURL("classpath").getPath()+localContainer;
            String dateFormat = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            File dateDirPath = new File(uploadPath + File.separator + dateFormat);
            if (!dateDirPath.exists()) {
                dateDirPath.mkdirs();
            }
            file.transferTo(new File(dateDirPath, fileName));

            FileAddParam fileAddParam = new FileAddParam();
            fileAddParam.setPath(Paths.get(localContainer, dateFormat, fileName).toString());
            fileAddParam.setName(fileName);
            fileAddParam.setProjectId(projectId);
            fileAddParam.setCreatorId(Long.valueOf(map.get("id").toString()));

            fileService.addFile(fileAddParam); // 将文件信息存入数据库
            return ResultMsg.success();

        } catch (Exception e) {
            log.error(e.toString());
            return ResultMsg.error();
        }
    }

    /**
     * 下载文件
     *
     * @param id
     * @param response
     */
    @ApiOperation("下载文件")
    @GetMapping("download")
    public void download(@RequestParam("id") Long id, HttpServletResponse response) {
        String openStyle = "attachment";
        try {
            getFile(openStyle, id, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件预览
     *
     * @param id
     * @param response
     * @throws IOException
     */
    @ApiOperation("预览文件")
    @GetMapping("preview")
    public void preview(@RequestParam("id") Long id, HttpServletResponse response) throws Exception {
        String openStyle = "inline";
        getFile(openStyle, id, response);
    }

    /**
     * 文件下载
     *
     * @param openStyle
     * @param id
     * @param response
     * @throws Exception
     */
    public void getFile(String openStyle, Long id, HttpServletResponse response) throws Exception {
        Files userFile = fileService.getFileById(id);
        String realPath = filePath + userFile.getPath();
        String fileName = userFile.getName();
        FileInputStream is = new FileInputStream(new File(realPath));
        // 附件下载
        response.setHeader("content-disposition", openStyle + ";filename=" + URLEncoder.encode(fileName, "UTF-8"));
        // 获取响应response输出流
        ServletOutputStream os = response.getOutputStream();
        // 文件拷贝
        IOUtils.copy(is, os);
        IOUtils.closeQuietly(is);
        IOUtils.closeQuietly(os);
        response.setContentType("application/octet-stream; charset=utf-8");

    }


}

