package com.perye.enterprise.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.perye.common.result.PageUtils;
import com.perye.common.result.TreeNode;
import com.perye.enterprise.entity.EnterpriseJob;

import java.util.List;
import java.util.Map;

/**
 * 企业职务配置表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface IEnterpriseJobService extends IService<EnterpriseJob> {

    /**
     * 多表页面信息查询
     * @param params
     * @return
     */
    PageUtils selectDataGrid(Map<String, Object> params);

    /**
     * 多表信息查询
     * @param params
     * @return
     */
    List<Map<String, Object>> selectEnterpriseJobList(Map<String, Object> params);

    /**
     * 根据企业职位获取职位树
     *
     * @param params
     * @return
     */
    List<TreeNode> selectTree(Map<String, Object> params);


}

