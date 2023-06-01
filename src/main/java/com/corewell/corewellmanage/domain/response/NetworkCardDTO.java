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
@ApiModel("网卡")
@AllArgsConstructor
@NoArgsConstructor
public class NetworkCardDTO {
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private Long id;
  /**
   * iccid
   */
  @ApiModelProperty(value = "iccid", required = false, example = "")
  private String iccid;
  /**
   * 运营商
   */
  @ApiModelProperty(value = "运营商", required = false, example = "")
  private String operator;
  /**
   * 供应商id
   */
  @ApiModelProperty(value = "供应商id", required = false, example = "")
  private String supplierId;
  /**
   * 供应商
   */
  @ApiModelProperty(value = "供应商", required = false, example = "")
  private String supplierName;
  /**
   * 项目id
   */
  @ApiModelProperty(value = "项目id", required = false, example = "")
  private String projectId;
  /**
   * 项目名称
   */
  @ApiModelProperty(value = "项目名称", required = false, example = "")
  private String projectName;
  /**
   * 入库时间
   */
  @ApiModelProperty(value = "入库时间", required = false, example = "")
  private Date joinTime;
  /**
   * 绑定设备
   */
  @ApiModelProperty(value = "绑定设备", required = false, example = "")
  private String device;
  /**
   * 绑定设备id
   */
  @ApiModelProperty(value = "绑定设备id", required = false, example = "")
  private String deviceId;
  /**
   * 绑定设备位置
   */
  @ApiModelProperty(value = "绑定设备位置", required = false, example = "")
  private String deviceAddress;
  /**
   * 套餐
   */
  @ApiModelProperty(value = "套餐", required = false, example = "")
  private String packages;
  /**
   * 套餐类型
   */
  @ApiModelProperty(value = "套餐类型", required = false, example = "")
  private String packagesType;
  /**
   * 沉默期类型
   */
  @ApiModelProperty(value = "沉默期类型", required = false, example = "")
  private String hibernateType;
  /**
   * 沉默期到期时间
   */
  @ApiModelProperty(value = "沉默期到期时间", required = false, example = "")
  private Date hibernateEndTime;
  /**
   * 激活时间
   */
  @ApiModelProperty(value = "激活时间", required = false, example = "")
  private Date activationTime;
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
