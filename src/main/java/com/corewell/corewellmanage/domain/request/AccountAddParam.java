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
@ApiModel("新增账户入参")
@AllArgsConstructor
@NoArgsConstructor
public class AccountAddParam {
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
     * 密码
     */
    @ApiModelProperty(value = "密码", required = false, example = "")
    private String password;
    /**
     * 电话
     */
    @ApiModelProperty(value = "电话", required = false, example = "")
    private String phone;
    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱", required = false, example = "")
    private String email;
    /**
     * 性别（1.男，2.女）
     */
    @ApiModelProperty(value = "性别（1.男，2.女）性别（1.男，2.女）", required = false, example = "")
    private String sex;
    /**
     * 角色（1.普通用户，2.项目经理，3.财务管理，4.采购管理，5.仓库管理，6.超级管理）
     */
    @ApiModelProperty(value = "角色（1.普通用户，2.项目经理，3.财务管理，4.采购管理，5.仓库管理，6.超级管理）", required = false, example = "")
    private String role;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", required = false, example = "")
    private Date createTime;

}
