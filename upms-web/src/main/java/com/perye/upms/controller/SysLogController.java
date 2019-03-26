package com.perye.upms.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.perye.common.base.BaseController;
import com.perye.common.result.PageUtils;
import com.perye.common.result.ResultMap;
import com.perye.upms.entity.SysLog;
import com.perye.upms.service.ISysLogService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 日志管理
 * @Author: Perye
 * @Date: 2019-03-26
 */
@RestController
@RequestMapping("/sys/log")
public class SysLogController extends BaseController {

    @Reference
    private ISysLogService sysLogService;

    @RequestMapping("/list")
    public ResultMap dataGrid(@RequestParam Map<String, Object> params) {
        PageUtils<SysLog> page = sysLogService.selectDataGrid(params);
        return ResultMap.ok().put("page", page);
    }
}
