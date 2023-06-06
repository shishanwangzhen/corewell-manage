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
@ApiModel("物料申请分页查询入参")
@AllArgsConstructor
@NoArgsConstructor
public class MaterialApplyPageParam {

    /**
     * 提单id
     */
    @ApiModelProperty(value = "提单id", required = false, example = "")
    private Long applicationFormId;
    /**
     * 物料名称id
     */
    @ApiModelProperty(value = "物料名称id", required = false, example = "")
    private Long materialId;

    /**
     * 创建者id
     */
    @ApiModelProperty(value = "创建者id", required = false, example = "")
    private Long creatorId;

    /**
     * 分页
     */
    @ApiModelProperty(value = "分页", required = true, example = "")
    private PageParam pageParam;

}
