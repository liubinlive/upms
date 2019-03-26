package com.perye.upms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.perye.upms.entity.SysResource;

import java.util.List;
import java.util.Map;

/**
 * 资源表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface ISysResourceService extends IService<SysResource> {

    List<SysResource> selectResourceList(Map<String, Object> params);


    List<SysResource> selectUserResourceListByUserId(Long userId);

    /**
     * 根据父ID和资源ID集合查找资源集合
     * @param parentId
     * @param menuIdList
     * @return
     */
    List<SysResource> selectListByParentId(Long parentId, List<Long> menuIdList);

    /**
     * 根据父ID查找资源集合
     * @param parentId
     * @return
     */
    List<SysResource> selectListByParentId(Long parentId);

    /**
     *  查找非按钮资源集合
     * @return
     */
    List<SysResource> selectNotButtonList();


}

