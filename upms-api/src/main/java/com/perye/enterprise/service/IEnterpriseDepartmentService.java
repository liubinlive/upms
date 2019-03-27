package com.perye.enterprise.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.perye.common.result.TreeNode;
import com.perye.enterprise.entity.EnterpriseDepartment;

import java.util.List;
import java.util.Map;

/**
 * 企业部门表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface IEnterpriseDepartmentService extends IService<EnterpriseDepartment> {

    /**
     *  树表
     * @param params
     * @return
     */
    List<Map<String, Object>> selectTreeGrid(Map<String, Object> params);

    /**
     * 根据企业部门获取部门树
     *
     * @param params
     * @return
     */
    List<TreeNode> selectTree(Map<String, Object> params);

}