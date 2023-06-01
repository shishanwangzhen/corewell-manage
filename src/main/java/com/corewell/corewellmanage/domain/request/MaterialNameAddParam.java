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
@ApiModel("物料名称新增入参")
@AllArgsConstructor
@NoArgsConstructor
public class MaterialNameAddParam {
  /**
   * 物料名称
   */
  @ApiModelProperty(value = "物料名称", required = false, example = "")
  private String name;
  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", required = true, example = "")
  private String number;
  /**
   * 图片地址
   */
  @ApiModelProperty(value = "图片地址", required = false, example = "")
  private String path;
  /**
   * 规格参数
   */
  @ApiModelProperty(value = "规格参数", required = false, example = "")
  private String parameter;
  /**
   * 物料类别
   */
  @ApiModelProperty(value = "物料类别", required = true, example = "")
  private String type;
  /**
   * 备注
   */
  @ApiModelProperty(value = "备注", required = false, example = "")
  private String notes;
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
