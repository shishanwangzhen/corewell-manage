package com.corewell.corewellmanage.domain.request;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
@ApiModel("修改账户入参")
@AllArgsConstructor
@NoArgsConstructor
public class FileUpdateParam {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id", required = false, example = "")
    private Long id;
    /**
     * 文件名称
     */
    @ApiModelProperty(value = "文件名称", required = false, example = "")
    private String name;
    /**
     * 文件地址
     */
    @ApiModelProperty(value = "文件地址", required = false, example = "")
    private String path;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", required = false, example = "")
    private String notes;
    /**
     * 项目id
     */
    @ApiModelProperty(value = "项目id", required = false, example = "")
    private Long projectId;
    /**
     * 创建者id
     */
    @ApiModelProperty(value = "创建者id", required = false, example = "")
    private Long creatorId;

}
