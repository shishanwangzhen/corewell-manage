package com.corewell.corewellmanage.service;


import com.corewell.corewellmanage.domain.request.ApplicationFormAddParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormPageParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormParam;
import com.corewell.corewellmanage.domain.request.ApplicationFormUpdateParam;
import com.corewell.corewellmanage.domain.response.ApplicationFormDTO;
import com.corewell.corewellmanage.result.ResultMsg;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2022/11/02/16:06
 * @Description:
 */
public interface ApplicationFormService {

    /**
     * 添加提单申请
     *
     * @param applicationFormAddParam
     * @return
     */
    ResultMsg addApplicationForm(ApplicationFormAddParam applicationFormAddParam);

    /**
     * 修改提单申请
     *
     * @param applicationFormUpdateParam
     * @return
     */
    ResultMsg updateApplicationForm(ApplicationFormUpdateParam applicationFormUpdateParam);

    /**
     * 删除提单申请
     *
     * @param id
     * @return
     */
    ResultMsg deleteApplicationForm(Long id);

    /**
     * 获取提单申请列表
     *
     * @param applicationFormParam
     * @return
     */
    ResultMsg getApplicationForm(ApplicationFormParam applicationFormParam);
    /**
     * 分页获取提单申请列表
     *
     * @param applicationFormPageParam
     * @return
     */
    List<ApplicationFormDTO> selectApplicationForm(ApplicationFormPageParam applicationFormPageParam);



}
