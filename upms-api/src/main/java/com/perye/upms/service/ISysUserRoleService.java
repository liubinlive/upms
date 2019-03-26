package com.perye.upms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.perye.upms.entity.SysUserRole;

import java.util.List;

/**
 * 用户角色表
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface ISysUserRoleService extends IService<SysUserRole> {

    /**
     * 根据用户ID或者拥有角色ID集合
     * @param userId
     * @return
     */
    List<Long> selectRoleIdListByUserId(Long userId);

    /**
     * 保存或修改用户与角色关系
     * @param userId
     * @param roleIdList
     */
    void saveOrUpdateUserRole(Long userId, List<Long> roleIdList);

    /**
     * 根据用户批量删除
     * @param userIds
     */
    void deleteBatchByUserIds(Long[] userIds);

    /**
     * 根据角色批量删除
     * @param roleIds
     */
    void deleteBatchByRoleIds(Long[] roleIds);


}

