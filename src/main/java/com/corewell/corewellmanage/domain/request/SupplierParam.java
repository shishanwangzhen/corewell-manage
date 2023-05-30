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
@ApiModel("供应商查询参数")
@AllArgsConstructor
@NoArgsConstructor
public class SupplierParam {
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private Long id;
  /**
   * 供应商名称
   */
  @ApiModelProperty(value = "供应商名称", required = false, example = "")
  private String name;
  /**
   * 供应商货源
   */
  @ApiModelProperty(value = "供应商货源", required = false, example = "")
  private String material;
  /**
   * 联系方式
   */
  @ApiModelProperty(value = "联系方式", required = false, example = "")
  private String phone;

  /**
   * 评价等级（1-10,10分最高）
   */
  @ApiModelProperty(value = "评价等级（1-10,10分最高）", required = false, example = "")
  private String level;
  /**
   * 采购次数
   */
  @ApiModelProperty(value = "采购次数", required = false, example = "")
  private Long counts;

  /**
   * 创建者id
   */
  @ApiModelProperty(value = "创建者id", required = false, example = "")
  private Long creatorId;

}
