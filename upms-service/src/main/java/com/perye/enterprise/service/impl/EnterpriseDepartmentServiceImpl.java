package com.perye.enterprise.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.perye.common.result.TreeNode;
import com.perye.enterprise.entity.EnterpriseDepartment;
import com.perye.enterprise.mapper.EnterpriseDepartmentMapper;
import com.perye.enterprise.service.IEnterpriseDepartmentService;

import java.util.List;
import java.util.Map;

/**
 * 企业部门表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
@Service
public class EnterpriseDepartmentServiceImpl extends ServiceImpl<EnterpriseDepartmentMapper, EnterpriseDepartment> implements IEnterpriseDepartmentService {


    @Override
    public List<Map<String, Object>> selectTreeGrid(Map<String, Object> params) {
        return this.baseMapper.selectTreeGrid(params);
    }

    @Override
    public List<TreeNode> selectTree(Map<String, Object> params) {
        return this.baseMapper.selectTree(params);
    }
}