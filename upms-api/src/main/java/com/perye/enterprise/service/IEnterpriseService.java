package com.perye.enterprise.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.perye.common.result.PageUtils;
import com.perye.enterprise.entity.Enterprise;

import java.util.List;
import java.util.Map;

/**
 * 企业信息表
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface IEnterpriseService extends IService<Enterprise> {

    /**
     * 多表页面信息查询
     * @param params
     * @return
     */
    PageUtils selectDataGrid(Map<String, Object> params);

    /**
     * 多表信息查询
     * @param par
     * @return
     */
    List<Map<String, Object>> selectEnterpriseList(Map<String, Object> par);


}

