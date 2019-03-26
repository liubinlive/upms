package com.perye.upms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.perye.common.result.PageUtils;
import com.perye.upms.entity.SysLog;
import com.perye.upms.mapper.SysLogMapper;
import com.perye.upms.service.ISysLogService;

import java.util.List;
import java.util.Map;

/**
 * 系统日志表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements ISysLogService {

    @Override
    public PageUtils selectDataGrid(Map<String, Object> params){
        Page<SysLog> page = new PageUtils<SysLog>(params).getPage();
        IPage<SysLog> iPage = this.baseMapper.selectSysLogPage(page, params);
        return new PageUtils<Map<String, Object>>(iPage);
    }

    @Override
    public List<SysLog> selectSysLogList(Map<String, Object> par){

        return this.baseMapper.selectSysLogList(par);
    }

}

