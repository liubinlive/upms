package com.perye.upms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.perye.common.result.TreeNode;
import com.perye.upms.entity.SysDic;

import java.util.List;
import java.util.Map;

/**
 * 数据字典表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface ISysDicService extends IService<SysDic> {

    /**
     * 获取变量树表
     *
     * @param params
     * @return
     */
    List<Map<String, Object>> selectTreeGrid(Map<String, Object> params);

    /**
     * 获取数据字典树
     *
     * @param params
     * @return
     */
    List<TreeNode> selectTree(Map<String, Object> params);

    /**
     * 根据父ID获取变量
     * @param params
     * @return
     */
    List<Map<String, Object>> selectTreeByParentId(Map<String, Object> params);

}
