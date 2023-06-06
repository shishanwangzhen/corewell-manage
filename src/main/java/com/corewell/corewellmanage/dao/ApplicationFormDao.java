package com.corewell.corewellmanage.dao;


import com.corewell.corewellmanage.domain.request.ApplicationFormAddParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormPageParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormUpdateParam;
import com.corewell.corewellmanage.domain.response.ApplicationFormDTO;
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
public interface ApplicationFormDao {

    /**
     * 添加提单申请
     *
     * @param applicationFormAddParam
     * @return
     */
    int addApplicationForm(ApplicationFormAddParam applicationFormAddParam);

    /**
     * 修改提单申请
     *
     * @param applicationFormUpdateParam
     * @return
     */
    int updateApplicationForm(ApplicationFormUpdateParam applicationFormUpdateParam);

    /**
     * 删除提单申请
     *
     * @param id
     * @return
     */
    int deleteApplicationForm(Long id);

    /**
     * 获取提单申请列表
     *
     * @param applicationFormParam
     * @return
     */
    List<ApplicationFormDTO> getApplicationForm(ApplicationFormParam applicationFormParam);

    /**
     * 获取提单申请列表
     *
     * @param applicationFormPageParam
     * @return
     */
    List<ApplicationFormDTO> selectApplicationForm(ApplicationFormPageParam applicationFormPageParam);

}
