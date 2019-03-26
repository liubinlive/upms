package com.perye.upms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.perye.common.result.SelectTreeNode;
import com.perye.upms.entity.SysRoleResource;

import java.util.List;

/**
 * 角色资源表
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface ISysRoleResourceService extends IService<SysRoleResource> {

    /**
     * 根据角色查找菜单ID集合
     * @param roleId
     * @return
     */
    List<Long> selectResourceIdListByRoleId(Long roleId);

    void saveOrUpdateRoleResource(Long roleId, List<Long> resourceIdList);

    void deleteBatch(Long[] roleIds);

    List<SelectTreeNode> selectResourceNodeListByRoleId(Long roleId);

}

