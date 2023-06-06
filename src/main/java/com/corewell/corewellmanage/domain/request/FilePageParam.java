package com.corewell.corewellmanage.domain.request;


import com.corewell.corewellmanage.result.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@Data
@ApiModel("查询文件入参")
@AllArgsConstructor
@NoArgsConstructor
public class FilePageParam {
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

    /**
     * 分页
     */
    @ApiModelProperty(value = "分页", required = true, example = "")
    private PageParam pageParam;

}
