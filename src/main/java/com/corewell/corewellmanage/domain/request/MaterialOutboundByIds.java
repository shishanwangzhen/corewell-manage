package com.corewell.corewellmanage.domain.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Administrator
 */
@Data
@ApiModel("物料出库查询入参")
@AllArgsConstructor
@NoArgsConstructor
public class MaterialOutboundByIds {
  /**
   * 主键id集合
   */
  @ApiModelProperty(value = "主键id集合", required = false, example = "")
  private List<Long> ids;

  /**
   * 出库单id
   */
  @ApiModelProperty(value = "出库单id", required = false, example = "")
  private String outboundApplyId;

}
