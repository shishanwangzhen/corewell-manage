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
@ApiModel("仓库")
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private Long id;
  /**
   * 仓库名称
   */
  @ApiModelProperty(value = "仓库名称", required = false, example = "")
  private String name;
  /**
   * 仓库地址
   */
  @ApiModelProperty(value = "仓库地址", required = false, example = "")
  private String address;
  /**
   * 负责人id
   */
  @ApiModelProperty(value = "负责人id", required = false, example = "")
  private Long managerId;
  /**
   * 联系方式
   */
  @ApiModelProperty(value = "联系方式", required = false, example = "")
  private String phone;
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
