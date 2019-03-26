package com.perye.upms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.perye.upms.entity.SysResource;

import java.util.List;
import java.util.Map;

/**
 * 资源表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface SysResourceMapper extends BaseMapper<SysResource> {

    List<SysResource> selectResourceList(Map<String, Object> params);
}
