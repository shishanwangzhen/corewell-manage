package com.corewell.corewellmanage.dao;

import com.corewell.corewellmanage.domain.Node;
import com.corewell.corewellmanage.domain.request.NodeAddParam;
import com.corewell.corewellmanage.domain.request.NodeParam;
import com.corewell.corewellmanage.domain.request.NodeUpdateParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangzhen
 * @Date: 2023/05/10/15:17
 * @Description:
 */
@Mapper
public interface NodeDao {
    /**
     * 添加节点
     *
     * @param nodeAddParam
     * @return
     */
    int addNode(NodeAddParam nodeAddParam);

    /**
     * 修改节点
     *
     * @param nodeUpdateParam
     * @return
     */
    int updateNode(NodeUpdateParam nodeUpdateParam);

    /**
     * 删除节点
     *
     * @param id
     * @return
     */
    int deleteNode(Long id);

    /**
     * 获取节点列表
     *
     * @param nodeParam
     * @return
     */
    List<Node> getNode(NodeParam nodeParam);

}
