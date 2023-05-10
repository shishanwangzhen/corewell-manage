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
@ApiModel("查询账户入参")
@AllArgsConstructor
@NoArgsConstructor
public class AccountParam {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id", required = false, example = "")
    private Long id;
    /**
     * 账号
     */
    @ApiModelProperty(value = "账号", required = false, example = "")
    private String account;
    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名", required = false, example = "")
    private String name;

    /**
     * 角色（1.普通用户，2.项目经理，3.财务管理，4.采购管理，5.仓库管理，6.超级管理）
     */
    @ApiModelProperty(value = "角色（1.普通用户，2.项目经理，3.财务管理，4.采购管理，5.仓库管理，6.超级管理）", required = false, example = "")
    private String role;

}
