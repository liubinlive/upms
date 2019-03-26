package com.perye.upms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.perye.common.result.TreeNode;
import com.perye.upms.entity.SysDic;
import com.perye.upms.mapper.SysDicMapper;
import com.perye.upms.service.ISysDicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 数据字典 服务实现类
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
@Service
public class SysDicServiceImpl extends ServiceImpl<SysDicMapper, SysDic> implements ISysDicService {

    @Override
    public List<Map<String, Object>> selectTreeGrid(Map<String, Object> params) {
        return this.baseMapper.selectTreeGrid(params);
    }

    @Override
    public List<TreeNode> selectTree(Map<String, Object> params) {
        return this.baseMapper.selectTree(params);
    }

    @Override
    public List<Map<String, Object>> selectTreeByParentId(Map<String, Object> params) {
        return this.baseMapper.selectTreeByParentId(params);
    }

}
