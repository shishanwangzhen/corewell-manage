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
@ApiModel("仓库导出数据")
@AllArgsConstructor
@NoArgsConstructor
@HeadRowHeight(value = 20)
public class WarehouseTemplate {

    @ApiModelProperty("仓库名称")
    @ExcelProperty(value = "仓库名称", index = 0)
    @ColumnWidth(value = 15)
    private String name;

    @ApiModelProperty("仓库地址")
    @ExcelProperty(value = "仓库地址", index = 1)
    @ColumnWidth(value = 15)
    private String address;

    @ApiModelProperty("管理员")
    @ExcelProperty(value = "管理员", index = 2)
    @ColumnWidth(value = 15)
    private String manager;

    @ApiModelProperty("联系方式")
    @ExcelProperty(value = "联系方式", index = 3)
    @ColumnWidth(value = 15)
    private String phone;

    @ApiModelProperty("备注")
    @ExcelProperty(value = "备注", index = 4)
    @ColumnWidth(value = 15)
    private String notes;

}
