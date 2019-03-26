package com.perye.job.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.perye.job.entity.ScheduleJobEntity;

import java.util.Map;

/**
 * 定时任务
 *
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface ScheduleJobMapper extends BaseMapper<ScheduleJobEntity> {

    /**
     * 批量更新状态
     */
    int updateBatch(Map<String, Object> map);
}
