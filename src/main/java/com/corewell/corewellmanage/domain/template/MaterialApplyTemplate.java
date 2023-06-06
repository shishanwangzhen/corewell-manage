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
@ApiModel("物料申请数据模板")
@AllArgsConstructor
@NoArgsConstructor
@HeadRowHeight(value = 20)
public class MaterialApplyTemplate {
    /**
     * 物料名
     */
    @ApiModelProperty(value = "物料名", required = false, example = "")
    @ExcelProperty(value = "物料名", index = 0)
    @ColumnWidth(value = 15)
    private String materialName;
    /**
     * 物料类型
     */
    @ApiModelProperty(value = "物料类型", required = false, example = "")
    @ExcelProperty(value = "物料类型", index = 1)
    @ColumnWidth(value = 15)
    private Long materialType;
    /**
     * 规格参数
     */
    @ApiModelProperty(value = "规格参数", required = false, example = "")
    @ExcelProperty(value = "规格参数", index = 2)
    @ColumnWidth(value = 15)
    private String parameter;
    /**
     * 数量
     */
    @ApiModelProperty(value = "数量", required = false, example = "")
    @ExcelProperty(value = "数量", index = 3)
    @ColumnWidth(value = 15)
    private Long counts;
    /**
     * 单位
     */
    @ApiModelProperty(value = "单位", required = false, example = "")
    @ExcelProperty(value = "单位", index = 4)
    @ColumnWidth(value = 15)
    private String unit;
    /**
     * 单价
     */
    @ApiModelProperty(value = "单价", required = false, example = "")
    @ExcelProperty(value = "单价", index = 5)
    @ColumnWidth(value = 15)
    private String price;
    /**
     * 运费
     */
    @ApiModelProperty(value = "运费", required = false, example = "")
    @ExcelProperty(value = "运费", index = 6)
    @ColumnWidth(value = 15)
    private String freight;
    /**
     * 采购链接
     */
    @ApiModelProperty(value = "采购链接", required = false, example = "")
    @ExcelProperty(value = "采购链接", index = 7)
    @ColumnWidth(value = 15)
    private String link;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注", required = false, example = "")
    @ExcelProperty(value = "备注", index = 8)
    @ColumnWidth(value = 15)
    private String notes;

}
