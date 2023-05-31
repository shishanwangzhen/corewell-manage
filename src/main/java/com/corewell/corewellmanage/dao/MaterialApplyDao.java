package com.corewell.corewellmanage.dao;


import com.corewell.corewellmanage.domain.MaterialApply;
import com.corewell.corewellmanage.domain.request.MaterialApplyAddParam;
import com.corewell.corewellmanage.domain.request.MaterialApplyParam;
import com.corewell.corewellmanage.domain.request.MaterialApplyUpdateParam;
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
public interface MaterialApplyDao {

    /**
     * 添加物料申请
     *
     * @param materialApplyAddParam
     * @return
     */
    int addMaterialApply(MaterialApplyAddParam materialApplyAddParam);

    /**
     * 修改物料申请
     *
     * @param materialApplyUpdateParam
     * @return
     */
    int updateMaterialApply(MaterialApplyUpdateParam materialApplyUpdateParam);

    /**
     * 删除物料申请
     *
     * @param id
     * @return
     */
    int deleteMaterialApply(Long id);

    /**
     * 获取物料申请列表
     *
     * @param materialApplyParam
     * @return
     */
    List<MaterialApply> getMaterialApply(MaterialApplyParam materialApplyParam);

}
