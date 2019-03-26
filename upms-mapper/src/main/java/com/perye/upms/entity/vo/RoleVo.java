package com.perye.upms.entity.vo;

import com.perye.upms.entity.SysResource;
import com.perye.upms.entity.SysRole;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Perye
 * @Date: 2019-03-26
 */
public class RoleVo extends SysRole implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 拥有的权限列表
     */
    private List<SysResource> permissions;

    public List<SysResource> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysResource> permissions) {
        this.permissions = permissions;
    }
}
