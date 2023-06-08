package com.corewell.corewellmanage.domain;

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
@ApiModel("出库申请")
@AllArgsConstructor
@NoArgsConstructor
public class OutboundApply {
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private String id;
  /**
   * 审核人id
   */
  @ApiModelProperty(value = "审核人id", required = false, example = "")
  private Long reviewerId;

  /**
   * 领用人id
   */
  @ApiModelProperty(value = "领用人id", required = false, example = "")
  private Long userId;
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
  /**
   * 提单状态（1.创建提交，2审核未通过，3.审核通过，4.出库签收）
   */
  @ApiModelProperty(value = "提单状态（1.创建提交，2审核未通过，3.审核通过，4.出库签收）", required = false, example = "")
  private String status;
  
}
