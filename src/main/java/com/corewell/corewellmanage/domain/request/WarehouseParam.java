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
@ApiModel("仓库查询入参")
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseParam {
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
   * 负责人id
   */
  @ApiModelProperty(value = "负责人id", required = false, example = "")
  private Long managerId;

  /**
   * 创建者id
   */
  @ApiModelProperty(value = "创建者id", required = false, example = "")
  private Long creatorId;



}
