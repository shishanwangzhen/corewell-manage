package com.corewell.corewellmanage.utils;

import com.corewell.corewellmanage.config.UserRequest;
import com.corewell.corewellmanage.constants.BaseConstants;
import com.corewell.corewellmanage.domain.Files;
import com.corewell.corewellmanage.domain.request.FileAddParam;
import com.corewell.corewellmanage.result.ResultMsg;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
 * 文件上传工具包
 */
@Slf4j
public class FileUtils {

    /*// 将 yml 中的自定义配置注入到这里
    @Value("${gorit.file.root.path}")
    private String filePath;*/

    /**
     * @param file     文件
     * @param path     文件存放路径
     * @param fileName 源文件名
     * @return
     */
    public static boolean upload(MultipartFile file, String path, String fileName) {

        // 生成新的文件名
        //String realPath = path + "/" + FileNameUtils.getFileName(fileName);

        //使用原文件名
        String realPath = path + "/" + fileName;

        File dest = new File(realPath);

        //判断文件父目录是否存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }

        try {
            //保存文件
            file.transferTo(dest);
            return true;
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }

    }



    /**
     * @param file     文件
     * @param filePath     图片存放路径
     * @return
     */
    public static String uploadFile(@RequestParam("file") MultipartFile file,String filePath) {
        try {

            String fileName = file.getOriginalFilename();
            String extension = FilenameUtils.getExtension(fileName);
            long size = file.getSize();
            String type = file.getContentType();
            // 根据日期生成目录
            String localContainer = "/pictureContainer";
            String uploadPath = filePath + localContainer;

            //String uploadPath = ResourceUtils.getURL("classpath").getPath()+localContainer;
            String dateFormat = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            File dateDirPath = new File(uploadPath + File.separator + dateFormat);
            if (!dateDirPath.exists()) {
                dateDirPath.mkdirs();
            }
            file.transferTo(new File(dateDirPath, fileName));
            String path = Paths.get(localContainer, dateFormat, fileName).toString();
            return path;
        } catch (Exception e) {
            log.error(e.toString());
            return "上传文件失败";
        }
    }

    /**
     * 下载文件
     *
     * @param path
     * @param response
     */
    public static void download(String path,HttpServletResponse response) {
        String openStyle = "attachment";
        try {
            getFile(openStyle,path, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件预览
     * @param path
     * @param response
     * @throws IOException
     */
    public static void preview(String path,HttpServletResponse response) throws Exception {
        String openStyle = "inline";
        getFile(openStyle,path, response);
    }

    /**
     * 图片下载
     *
     * @param openStyle
     * @param response
     * @throws Exception
     */
    public static void getFile(String openStyle,String path, HttpServletResponse response) throws Exception {
        log.info("文件路径URL  path::::{}",path);
        String fileName=path.contains(BaseConstants.TEMPLATE)?path.substring(path.indexOf(BaseConstants.TEMPLATE)+9):path.substring(path.indexOf("-")+8);
        log.info("文件名fileName::::{}",fileName);
        FileInputStream is = new FileInputStream(new File(path));
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
