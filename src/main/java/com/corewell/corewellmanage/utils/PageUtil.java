package com.corewell.corewellmanage.utils;

import com.corewell.corewellmanage.result.PageParam;
import com.github.pagehelper.PageHelper;

/**
 * @description: 分页工具类，简化分页写法
 * @author: yanglimou
 * @time: 2020/5/14 11:10
 */
public class PageUtil {
    public static void setPageParams(PageParam pageParams) {
        PageHelper.startPage(pageParams.getPageNum(), pageParams.getPageSize(), pageParams.getOrderBy());
    }
}
