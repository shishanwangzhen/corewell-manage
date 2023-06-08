package com.corewell.corewellmanage.domain.response;

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
@ApiModel("物料出库还参")
@AllArgsConstructor
@NoArgsConstructor
public class MaterialOutboundDTO {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id", required = false, example = "")
    private Long id;
    /**
     * 物料名称id
     */
    @ApiModelProperty(value = "物料名称id", required = false, example = "")
    private Long materialId;
    /**
     * 物料名称
     */
    @ApiModelProperty(value = "物料名称", required = false, example = "")
    private String materialName;
    /**
     * 物料类型
     */
    @ApiModelProperty(value = "物料类型", required = false, example = "")
    private String materialType;
    /**
     * 出库单id
     */
    @ApiModelProperty(value = "出库单id", required = false, example = "")
    private String outboundApplyId;
    /**
     * 规格参数
     */
    @ApiModelProperty(value = "规格参数", required = false, example = "")
    private String parameter;
    /**
     * 数量
     */
    @ApiModelProperty(value = "数量", required = false, example = "")
    private Long counts;
    /**
     * 单位
     */
    @ApiModelProperty(value = "单位", required = false, example = "")
    private String unit;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", required = false, example = "")
    private String notes;
    /**
     * 创建者id
     */
    @ApiModelProperty(value = "创建者id", required = false, example = "")
    private Long creatorId;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = false, example = "")
    private Date createTime;
}
