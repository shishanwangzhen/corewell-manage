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
@ApiModel("供应商修改入参")
@AllArgsConstructor
@NoArgsConstructor
public class SupplierUpdateParam {
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
   * 供应商链接
   */
  @ApiModelProperty(value = "供应商链接", required = false, example = "")
  private String link;
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
   * 备注
   */
  @ApiModelProperty(value = "备注", required = false, example = "")
  private String notes;

  /**
   * 修改时间
   */
  @ApiModelProperty(value = "修改时间", required = false, example = "")
  private Date updateTime;
}
