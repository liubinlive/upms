package com.perye.upms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.perye.common.result.PageUtils;
import com.perye.upms.entity.SysFile;
import com.perye.upms.mapper.SysFileMapper;
import com.perye.upms.service.ISysFileService;

import java.util.List;
import java.util.Map;

/**
 * 附件表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
@Service
public class SysFileServiceImpl extends ServiceImpl<SysFileMapper, SysFile> implements ISysFileService {

    @Override
    public List<SysFile> selectFileListByTableIdAndRecordId(Map<String, Object> params) {
        return this.baseMapper.selectFileListByTableIdAndRecordId(params);
    }

    @Override
    public PageUtils<SysFile> selectSysFilePage(Map<String, Object> params) {
        Page<SysFile> page = new PageUtils<SysFile>(params).getPage();
        IPage<SysFile> iPage = this.baseMapper.selectSysFilePage(page, params);
        return new PageUtils<SysFile>(iPage);
    }
}