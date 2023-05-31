package com.corewell.corewellmanage.domain.request;


import com.corewell.corewellmanage.result.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@Data
@ApiModel("分页查询账户入参")
@AllArgsConstructor
@NoArgsConstructor
public class AccountPageParam {

    /**
     * 角色（1.普通用户，2.项目经理，3.财务管理，4.采购管理，5.仓库管理，6.超级管理）
     */
    @ApiModelProperty(value = "角色（1.普通用户，2.项目经理，3.财务管理，4.采购管理，5.仓库管理，6.超级管理）", required = false, example = "")
    private String role;

    /**
     * 分页
     */
    @ApiModelProperty(value = "分页", required = true, example = "")
    private PageParam pageParam;

}
