package com.corewell.corewellmanage.domain.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Administrator
 */
@Data
@ApiModel("提单申请修改入参")
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationFormUpdateParam {
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private Long id;
  /**
   * 采购编号
   */
  @ApiModelProperty(value = "采购编号", required = false, example = "")
  private String number;
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
   * 合计金额
   */
  @ApiModelProperty(value = "合计金额", required = false, example = "")
  private BigDecimal totalAmount;
  /**
   * 提单状态（1.创建保存，2.提交，3.项目经理审核未通过，4.项目经理审核通过，5.财务审核未通过，6.财务审核通过）
   */
  @ApiModelProperty(value = "提单状态（1.创建保存，2.提交，3.项目经理审核未通过，4.项目经理审核通过，5.财务审核未通过，6.财务审核通过）", required = false, example = "")
  private String status;
  /**
   * 备注
   */
  @ApiModelProperty(value = "备注", required = false, example = "")
  private String notes;

}
