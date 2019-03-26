package com.perye.enterprise.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.perye.common.result.PageUtils;
import com.perye.common.result.TreeNode;
import com.perye.enterprise.entity.EnterpriseJob;
import com.perye.enterprise.mapper.EnterpriseJobMapper;
import com.perye.enterprise.service.IEnterpriseJobService;

import java.util.List;
import java.util.Map;

/**
 * @Author: Perye
 * @Date: 2019-03-26
 */
@Service
public class EnterpriseJobServiceImpl extends ServiceImpl<EnterpriseJobMapper, EnterpriseJob> implements IEnterpriseJobService {

    @Override
    public PageUtils selectDataGrid(Map<String, Object> params){
        Page<Map<String, Object>> page = new PageUtils<Map<String, Object>>(params).getPage();
        IPage<Map<String, Object>> iPage= this.baseMapper.selectEnterpriseJobPage(page, params);
        return new PageUtils<Map<String, Object>>(iPage);
    }

    @Override
    public List<Map<String, Object>> selectEnterpriseJobList(Map<String, Object> par){

        return this.baseMapper.selectEnterpriseJobList(par);
    }

    @Override
    public List<TreeNode> selectTree(Map<String, Object> params) {
        return this.baseMapper.selectTree(params);
    }

}
