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
@ApiModel("物料申请查询入参")
@AllArgsConstructor
@NoArgsConstructor
public class MaterialApplyParam {
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private Long id;
  /**
   * 提单id
   */
  @ApiModelProperty(value = "提单id", required = false, example = "")
  private Long applicationFormId;
  /**
   * 物料名称id
   */
  @ApiModelProperty(value = "物料名称id", required = false, example = "")
  private Long materialId;


  /**
   * 创建者id
   */
  @ApiModelProperty(value = "创建者id", required = false, example = "")
  private Long creatorId;

}
