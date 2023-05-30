package com.corewell.corewellmanage.domain.request;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@Data
@ApiModel("网卡查询参数")
@AllArgsConstructor
@NoArgsConstructor
public class NetworkCardParam {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id", required = false, example = "")
    private Long id;
    /**
     * iccid
     */
    @ApiModelProperty(value = "iccid", required = false, example = "")
    private String iccid;
    /**
     * 运营商
     */
    @ApiModelProperty(value = "运营商", required = false, example = "")
    private String operator;
    /**
     * 供应商id
     */
    @ApiModelProperty(value = "供应商id", required = false, example = "")
    private String supplierId;
    /**
     * 项目id
     */
    @ApiModelProperty(value = "项目id", required = false, example = "")
    private String projectId;

    /**
     * 绑定设备
     */
    @ApiModelProperty(value = "绑定设备", required = false, example = "")
    private String device;
    /**
     * 绑定设备id
     */
    @ApiModelProperty(value = "绑定设备id", required = false, example = "")
    private String deviceId;

    /**
     * 套餐类型
     */
    @ApiModelProperty(value = "套餐类型", required = false, example = "")
    private String packagesType;
    /**
     * 沉默期类型
     */
    @ApiModelProperty(value = "沉默期类型", required = false, example = "")
    private String hibernateType;

    /**
     * 创建者id
     */
    @ApiModelProperty(value = "创建者id", required = false, example = "")
    private Long creatorId;

}
