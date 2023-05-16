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
@ApiModel("项目新增入参")
@AllArgsConstructor
@NoArgsConstructor
public class ProjectAddParam {

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
  /**
   * 项目地址
   */
  @ApiModelProperty(value = "项目地址", required = false, example = "")
  private String address;
  /**
   * 开始时间
   */
  @ApiModelProperty(value = "开始时间", required = false, example = "")
  private Date startTime;
  /**
   * 结束时间
   */
  @ApiModelProperty(value = "结束时间", required = false, example = "")
  private Date endTime;
}
