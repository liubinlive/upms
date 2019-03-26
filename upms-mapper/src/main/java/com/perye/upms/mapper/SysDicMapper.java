package com.perye.upms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.perye.common.result.TreeNode;
import com.perye.upms.entity.SysDic;

import java.util.List;
import java.util.Map;

/**
 * 数据字典 Mapper 接口
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface SysDicMapper extends BaseMapper<SysDic> {

    /**
     * 获取变量树表
     *
     * @param par
     * @return
     */
    List<Map<String, Object>> selectTreeGrid(Map<String, Object> par);

    /**
     * 获取数据字典树
     *
     * @param par
     * @return
     */
    List<TreeNode> selectTree(Map<String, Object> par);

    /**
     * 根据父ID获取变量
     * @param par
     * @return
     */
    List<Map<String, Object>> selectTreeByParentId(Map<String, Object> par);


}
