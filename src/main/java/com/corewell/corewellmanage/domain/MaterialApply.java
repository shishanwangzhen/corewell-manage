package com.corewell.corewellmanage.domain;

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
@ApiModel("物料申请")
@AllArgsConstructor
@NoArgsConstructor
public class MaterialApply {
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private Long id;
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
   * 单价
   */
  @ApiModelProperty(value = "单价", required = false, example = "")
  private String price;
  /**
   * 运费
   */
  @ApiModelProperty(value = "运费", required = false, example = "")
  private String freight;
  /**
   * 采购链接
   */
  @ApiModelProperty(value = "采购链接", required = false, example = "")
  private String link;
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
