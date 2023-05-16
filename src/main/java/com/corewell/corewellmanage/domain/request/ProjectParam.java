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
@ApiModel("项目查询入参")
@AllArgsConstructor
@NoArgsConstructor
public class ProjectParam {
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private Long id;
  /**
   * 项目编号
   */
  @ApiModelProperty(value = "项目编号", required = false, example = "")
  private String number;
  /**
   * 项目名称
   */
  @ApiModelProperty(value = "项目名称", required = false, example = "")
  private String name;
  /**
   * 创建者id
   */
  @ApiModelProperty(value = "创建者id", required = false, example = "")
  private Long creatorId;

}
