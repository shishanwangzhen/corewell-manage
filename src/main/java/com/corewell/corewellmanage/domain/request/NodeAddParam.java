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
@ApiModel("节点新增入参")
@AllArgsConstructor
@NoArgsConstructor
public class NodeAddParam {

  /**
   * 时间
   */
  @ApiModelProperty(value = "时间", required = false, example = "")
  private Date time;
  /**
   * 备注
   */
  @ApiModelProperty(value = "备注", required = false, example = "")
  private String notes;
  /**
   * 项目id
   */
  @ApiModelProperty(value = "项目id", required = false, example = "")
  private Long projectId;
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
