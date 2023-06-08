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
@ApiModel("分页提单申请查询入参")
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationFormPageParam {

  /**
   * 项目id
   */
  @ApiModelProperty(value = "项目id", required = false, example = "")
  private Long projectId;
  /**
   * 仓库id
   */
  @ApiModelProperty(value = "仓库id", required = false, example = "")
  private Long warehouseId;
  /**
   * 项目经理id
   */
  @ApiModelProperty(value = "项目经理id", required = false, example = "")
  private Long managerId;
  /**
   * 财务主管id
   */
  @ApiModelProperty(value = "财务主管id", required = false, example = "")
  private Long financeId;
  /**
   * 采购主管id
   */
  @ApiModelProperty(value = "采购主管id", required = false, example = "")
  private Long buyerId;
  /**
   * 提单状态（1.创建保存，2.提交，3.项目经理审核未通过，4.项目经理审核通过，5.财务审核未通过，6.财务审核通过）
   */
  @ApiModelProperty(value = "提单状态（1.创建保存，2.提交，3.项目经理审核未通过，4.项目经理审核通过，5.财务审核未通过，6.财务审核通过）", required = false, example = "")
  private String status;

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
