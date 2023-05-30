package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.MaterialNameAddParam;
import com.corewell.corewellmanage.domain.request.MaterialNameParam;
import com.corewell.corewellmanage.domain.request.MaterialNameUpdateParam;
import com.corewell.corewellmanage.result.ResultMsg;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface MaterialNameService {

    /**
     * 添加物料名称
     *
     * @param materialNameAddParam
     * @return
     */
    ResultMsg addMaterialName(MaterialNameAddParam materialNameAddParam);

    /**
     * 修改物料名称
     *
     * @param materialNameUpdateParam
     * @return
     */
    ResultMsg updateMaterialName(MaterialNameUpdateParam materialNameUpdateParam);

    /**
     * 删除物料名称
     *
     * @param id
     * @return
     */
    ResultMsg deleteMaterialName(Long id);

    /**
     * 获取物料名称列表
     *
     * @param materialNameParam
     * @return
     */
    ResultMsg getMaterialName(MaterialNameParam materialNameParam);

}
