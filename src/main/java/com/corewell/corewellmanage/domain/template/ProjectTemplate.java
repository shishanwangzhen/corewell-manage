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
@ApiModel("项目导出数据")
@AllArgsConstructor
@NoArgsConstructor
@HeadRowHeight(value = 20)
public class ProjectTemplate {

    @ApiModelProperty("项目名称")
    @ExcelProperty(value = "项目名称", index = 0)
    @ColumnWidth(value = 15)
    private String name;

    @ApiModelProperty("项目编号")
    @ExcelProperty(value = "项目编号", index = 1)
    @ColumnWidth(value = 15)
    private String number;


    @ApiModelProperty("项目主管")
    @ExcelProperty(value = "项目主管", index = 2)
    @ColumnWidth(value = 15)
    private String manager;

    @ApiModelProperty("项目地址")
    @ExcelProperty(value = "项目地址", index = 3)
    @ColumnWidth(value = 15)
    private String address;

    @ApiModelProperty("开始时间")
    @ExcelProperty(value = "开始时间", index = 4)
    @ColumnWidth(value = 10)
    private String startTime;

    @ApiModelProperty("结束时间")
    @ExcelProperty(value = "结束时间", index =5)
    @ColumnWidth(value = 15)
    private String endTime;
}
