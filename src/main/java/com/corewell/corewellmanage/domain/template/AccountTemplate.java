package com.corewell.corewellmanage.domain.template;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@Data
@ApiModel("用户导出数据模板")
@AllArgsConstructor
@NoArgsConstructor
@HeadRowHeight(value = 20)
public class AccountTemplate {

    @ApiModelProperty("账号")
    @ExcelProperty(value = "账号", index = 0)
    @ColumnWidth(value = 15)
    private String account;

    @ApiModelProperty("电话")
    @ExcelProperty(value = "电话", index = 1)
    @ColumnWidth(value = 15)
    private String phone;

    @ApiModelProperty("邮箱")
    @ExcelProperty(value = "邮箱", index = 2)
    @ColumnWidth(value = 15)
    private String email;

    @ApiModelProperty("性别")
    @ExcelProperty(value = "性别", index = 3)
    @ColumnWidth(value = 10)
    private String sex;

    @ApiModelProperty("创建时间")
    @ExcelProperty(value = "创建时间", index =4)
    @ColumnWidth(value = 15)
    private String createTime;

}
