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
@ApiModel("登录账户入参")
@AllArgsConstructor
@NoArgsConstructor
public class AccountReq {
    /**
     * 账号
     */
    @ApiModelProperty(value = "账号", required = false, example = "admin")
    private String account;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", required = false, example = "123456")
    private String password;


}
