package com.corewell.corewellmanage.domain.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Administrator
 */
@Data
@ApiModel("物料采购修改入参")
@AllArgsConstructor
@NoArgsConstructor
public class MaterialPurchaseUpdateParam {
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private Long id;
  /**
   * 物料id
   */
  @ApiModelProperty(value = "物料id", required = false, example = "")
  private Long materialId;
  /**
   * 规格参数
   */
  @ApiModelProperty(value = "规格参数", required = false, example = "")
  private String parameter;
  /**
   * 需采购数量数量
   */
  @ApiModelProperty(value = "需采购数量数量", required = false, example = "")
  private Long counts;
  /**
   * 已采购数量
   */
  @ApiModelProperty(value = "已采购数量", required = false, example = "")
  private Long completeCounts;
  /**
   * 未已采购数量
   */
  @ApiModelProperty(value = "未已采购数量", required = false, example = "")
  private Long incompleteCounts;
  /**
   * 单位
   */
  @ApiModelProperty(value = "单位", required = false, example = "")
  private String unit;
  /**
   * 运费
   */
  @ApiModelProperty(value = "运费", required = false, example = "")
  private BigDecimal freight;
  /**
   * 税费
   */
  @ApiModelProperty(value = "税费", required = false, example = "")
  private BigDecimal taxation;
  /**
   * 发票
   */
  @ApiModelProperty(value = "发票", required = false, example = "")
  private String invoice;
  /**
   * 采购链接
   */
  @ApiModelProperty(value = "采购链接", required = false, example = "")
  private String link;
  /**
   * 单价
   */
  @ApiModelProperty(value = "单价", required = false, example = "")
  private BigDecimal price;
  /**
   * 总价
   */
  @ApiModelProperty(value = "总价", required = false, example = "")
  private BigDecimal totalPrice;
  /**
   * 备注
   */
  @ApiModelProperty(value = "备注", required = false, example = "")
  private String notes;

}
