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
@ApiModel("仓库分页查询入参")
@AllArgsConstructor
@NoArgsConstructor
public class WarehousePageParam {
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

  /**
   * 分页
   */
  @ApiModelProperty(value = "分页", required = true, example = "")
  private PageParam pageParam;



}
