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
@ApiModel("仓库修改入参")
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseUpdateParam {
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


}
