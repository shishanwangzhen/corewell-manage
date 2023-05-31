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
@ApiModel("物料出库修改入参")
@AllArgsConstructor
@NoArgsConstructor
public class MaterialOutboundUpdateParam {
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
   * 出库单id
   */
  @ApiModelProperty(value = "出库单id", required = false, example = "")
  private Long outboundApplyId;
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
   * 备注
   */
  @ApiModelProperty(value = "备注", required = false, example = "")
  private String notes;

}
