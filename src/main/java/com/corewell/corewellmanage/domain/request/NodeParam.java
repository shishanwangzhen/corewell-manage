package com.corewell.corewellmanage.domain.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Administrator
 */
@Data
@ApiModel("节点查询入参")
@AllArgsConstructor
@NoArgsConstructor
public class NodeParam {

  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private Long id;
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


}
