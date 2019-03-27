package com.perye.upms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.perye.common.result.SelectTreeNode;
import com.perye.upms.entity.SysRoleResource;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 角色资源表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface SysRoleResourceMapper extends BaseMapper<SysRoleResource> {

    /**
     * 根据角色查找菜单ID集合
     * @param roleId
     * @return
     */
    @Select("select t.resource_id from t_sys_role_resource t where t.role_id=#{roleId}")
    @ResultType(Long.class)
    List<Long> selectResourceIdListByRoleId(@Param("roleId") Long roleId);

    void deleteBatch(Long[] roleIds);

    /**
     * 根据角色查找菜单node集合
     *
     * @param roleId
     * @return
     */
    List<SelectTreeNode> selectResourceNodeListByRoleId(@Param("roleId") Long roleId);


}