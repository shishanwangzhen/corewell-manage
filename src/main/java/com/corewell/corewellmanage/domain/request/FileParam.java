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
@ApiModel("查询账户入参")
@AllArgsConstructor
@NoArgsConstructor
public class FileParam {
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
     * 项目id
     */
    @ApiModelProperty(value = "项目id", required = false, example = "")
    private Long projectId;

}
