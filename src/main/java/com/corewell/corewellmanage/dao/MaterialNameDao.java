package com.corewell.corewellmanage.dao;


import com.corewell.corewellmanage.domain.MaterialName;
import com.corewell.corewellmanage.domain.request.MaterialNameAddParam;
import com.corewell.corewellmanage.domain.request.MaterialNameParam;
import com.corewell.corewellmanage.domain.request.MaterialNameUpdateParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
@Mapper
public interface MaterialNameDao {

    /**
     * 添加物料名称
     *
     * @param materialNameAddParam
     * @return
     */
    int addMaterialName(MaterialNameAddParam materialNameAddParam);

    /**
     * 修改物料名称
     *
     * @param materialNameUpdateParam
     * @return
     */
    int updateMaterialName(MaterialNameUpdateParam materialNameUpdateParam);

    /**
     * 删除物料名称
     *
     * @param id
     * @return
     */
    int deleteMaterialName(Long id);

    /**
     * 获取物料名称列表
     *
     * @param materialNameParam
     * @return
     */
    List<MaterialName> getMaterialName(MaterialNameParam materialNameParam);

}
