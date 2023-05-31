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
@ApiModel("物料入库")
@AllArgsConstructor
@NoArgsConstructor
public class MaterialReceipt {
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
   * 规格参数
   */
  @ApiModelProperty(value = "规格参数", required = false, example = "")
  private String parameter;
  /**
   * 数量
   */
  @ApiModelProperty(value = "数量", required = false, example = "")
  private String counts;
  /**
   * 单位
   */
  @ApiModelProperty(value = "单位", required = false, example = "")
  private String unit;
  /**
   * 仓库id
   */
  @ApiModelProperty(value = "仓库id", required = false, example = "")
  private Long warehouseId;
  /**
   * 仓库具体位置
   */
  @ApiModelProperty(value = "仓库具体位置", required = false, example = "")
  private String warehouseAddress;
  /**
   * 维保时间
   */
  @ApiModelProperty(value = "维保时间", required = false, example = "")
  private Date endTime;
  /**
   * 入库来源（1.采购入库，2.商家赠送）
   */
  @ApiModelProperty(value = "入库来源（1.采购入库，2.商家赠送）", required = false, example = "")
  private String source;
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
