package com.perye.upms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.perye.common.result.PageUtils;
import com.perye.upms.entity.SysRole;
import com.perye.upms.entity.vo.RoleVo;

import java.util.List;
import java.util.Map;

/**
 * 角色表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface ISysRoleService extends IService<SysRole> {

    /**
     * 多表页面信息查询
     * @param params
     * @return
     */
    PageUtils selectDataGrid(Map<String, Object> params);

    /**
     * 多表信息查询
     * @param par
     * @return
     */
    List<SysRole> selectSysRoleList(Map<String, Object> par);

    RoleVo selectByUserId(Long userId);

    RoleVo selectByRoleId(Long roleId);

    void saveByVo(SysRole role);

    void updateByVo(SysRole role);

    void deleteBatch(Long[] roleIds);
}

