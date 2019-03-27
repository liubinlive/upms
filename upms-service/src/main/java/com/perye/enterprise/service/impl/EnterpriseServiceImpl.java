package com.perye.enterprise.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.perye.common.result.PageUtils;
import com.perye.enterprise.entity.Enterprise;
import com.perye.enterprise.mapper.EnterpriseMapper;
import com.perye.enterprise.service.IEnterpriseService;

import java.util.List;
import java.util.Map;

/**
 * 企业信息表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
@Service
public class EnterpriseServiceImpl extends ServiceImpl<EnterpriseMapper, Enterprise> implements IEnterpriseService {

    @Override
    public PageUtils selectDataGrid(Map<String, Object> params){
        Page<Map<String, Object>> page = new PageUtils<Map<String, Object>>(params).getPage();
        IPage<Map<String, Object>> iPage=this.baseMapper.selectEnterprisePage(page, params);
        return new PageUtils<Map<String, Object>>(iPage);
    }

    @Override
    public List<Map<String, Object>> selectEnterpriseList(Map<String, Object> par){
        return this.baseMapper.selectEnterpriseList(par);
    }

}