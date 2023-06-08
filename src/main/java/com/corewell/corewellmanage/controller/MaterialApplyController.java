package com.corewell.corewellmanage.controller;

import com.alibaba.excel.EasyExcel;
import com.corewell.corewellmanage.constants.BaseConstants;
import com.corewell.corewellmanage.domain.Account;
import com.corewell.corewellmanage.domain.request.*;
import com.corewell.corewellmanage.domain.response.MaterialApplyDTO;
import com.corewell.corewellmanage.domain.template.MaterialApplyTemplate;
import com.corewell.corewellmanage.result.ResultMsg;
import com.corewell.corewellmanage.service.MaterialApplyService;
import com.corewell.corewellmanage.utils.FileUtils;
import com.corewell.corewellmanage.utils.PageUtil;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.text.ParseException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/14:46
 * @Description:
 */

@RestController
@RequestMapping("/corewell/materialApply/")
@Api(tags = "物料申请")
public class MaterialApplyController {
    /**
     * 将 yml 中的自定义配置注入到这里
     */
    @Value("${gorit.file.root.path}")
    private String filePath;

    @Autowired
    private MaterialApplyService materialApplyService;

    @ApiOperation(value = "添加物料申请")
    @PostMapping("addMaterialApply")
    public ResultMsg addMaterialApply(@RequestBody MaterialApplyAddParam materialApplyAddParam) {
        ResultMsg resultMsg = materialApplyService.addMaterialApply(materialApplyAddParam);
        return resultMsg;
    }


    @ApiOperation("修改物料申请")
    @PostMapping("updateMaterialApply")
    public ResultMsg updateMaterialApply(@RequestBody MaterialApplyUpdateParam materialApplyUpdateParam) {
        ResultMsg resultMsg = materialApplyService.updateMaterialApply(materialApplyUpdateParam);
        return resultMsg;
    }

    @ApiOperation("删除物料申请")
    @PostMapping("deleteMaterialApply")
    @ApiImplicitParam(value = "主键id", name = "1", required = true)
    public ResultMsg deleteMaterialApply(Long id) {
        ResultMsg resultMsg = materialApplyService.deleteMaterialApply(id);
        return resultMsg;
    }

    @ApiOperation(value = "查询物料申请", response = MaterialApplyDTO.class)
    @PostMapping("getMaterialApply")
    public ResultMsg getMaterialApply(@RequestBody MaterialApplyParam materialApplyParam) {
        ResultMsg resultMsg = materialApplyService.getMaterialApply(materialApplyParam);
        return resultMsg;
    }
    @ApiOperation(value = "分页查询文件", response = MaterialApplyDTO.class)
    @PostMapping("selectMaterialApply")
    public ResultMsg selectMaterialApply(@RequestBody MaterialApplyPageParam materialApplyPageParam) {
        PageUtil.setPageParams(materialApplyPageParam.getPageParam());
        List<MaterialApplyDTO> list = materialApplyService.selectMaterialApply(materialApplyPageParam);
        PageInfo<Account> pageInfo = new PageInfo(list);
        return ResultMsg.success(pageInfo);
    }
    @ApiOperation("物料申请批量导入")
    @PostMapping("importMaterialApply")
    public ResultMsg importMaterialApply(@RequestParam("file") MultipartFile file) throws ParseException {
        List<MaterialApplyTemplate> materialApplyTemplateList = null;
        System.out.println("importMaterialApply+++++++======"+file.toString());
        // 1.excel同步读取数据
        try {
            materialApplyTemplateList = EasyExcel.read(new BufferedInputStream(file.getInputStream())).head(MaterialApplyTemplate.class).sheet().doReadSync();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(materialApplyTemplateList.toString());
        // 5.入库操作
        for (int i = 0; i < materialApplyTemplateList.size(); i++) {
            MaterialApplyTemplate materialApplyTemplate = materialApplyTemplateList.get(i);
            materialApplyService.importMaterialApply(materialApplyTemplate);
        }
        return ResultMsg.success();

    }

    @ApiOperation("下载物料申请模板")
    @GetMapping("downloadMaterialApply")
    public ResultMsg downloadMaterialApply(@RequestParam("fileName") String fileName, HttpServletResponse response) {
        try {
            String path = filePath + BaseConstants.TEMPLATE + fileName;
            FileUtils.download(path, response);
            return ResultMsg.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultMsg.error();
        }
    }

}

