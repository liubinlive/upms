package com.perye.upms.entity.vo;

import com.perye.common.util.JacksonUtils;
import com.perye.upms.entity.SysRole;
import com.perye.upms.entity.SysUser;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Perye
 * @Date: 2019-03-26
 */
public class UserVo extends SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String enterpriseName;

    private String departmentName;

    private String jobName;

    private List<SysRole> roles;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }

    /**
     * 密码盐
     */
    public String getCredentialsSalt() {
        return getLoginName() + getSalt();
    }

    @Override
    public String toString() {
        return JacksonUtils.toJson(this);
    }
}