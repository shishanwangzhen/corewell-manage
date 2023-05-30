package com.corewell.corewellmanage.domain;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Administrator
 */
@Data
@ApiModel("物料名称")
@AllArgsConstructor
@NoArgsConstructor
public class MaterialName {

  private Long id;
  private String name;
  private String number;
  private String path;
  private String parameter;
  private String type;
  private String notes;
  private Long creatorId;
  private Date createTime;
  
}
