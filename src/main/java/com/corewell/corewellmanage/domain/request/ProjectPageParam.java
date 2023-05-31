package com.corewell.corewellmanage.domain.request;

import com.corewell.corewellmanage.result.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@Data
@ApiModel("项目分页查询入参")
@AllArgsConstructor
@NoArgsConstructor
public class ProjectPageParam {

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
   * 项目经理id
   */
  @ApiModelProperty(value = "项目经理id", required = false, example = "")
  private Long managerId;

  /**
   * 分页
   */
  @ApiModelProperty(value = "分页", required = true, example = "")
  private PageParam pageParam;



}
