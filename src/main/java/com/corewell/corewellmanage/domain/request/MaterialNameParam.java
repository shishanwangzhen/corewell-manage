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
@ApiModel("物料名称查询参数")
@AllArgsConstructor
@NoArgsConstructor
public class MaterialNameParam {
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private Long id;
  /**
   * 物料名称
   */
  @ApiModelProperty(value = "物料名称", required = false, example = "")
  private String name;
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = false, example = "")
  private String number;

  /**
   * 规格参数
   */
  @ApiModelProperty(value = "规格参数", required = false, example = "")
  private String parameter;
  /**
   * 物料类别
   */
  @ApiModelProperty(value = "物料类别", required = false, example = "")
  private String type;

  /**
   * 创建者id
   */
  @ApiModelProperty(value = "创建者id", required = false, example = "")
  private Long creatorId;

}
