package com.perye.job.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.perye.common.result.PageUtils;
import com.perye.job.entity.ScheduleJobEntity;

import java.util.Map;

/**
 * 定时任务
 * @Author: Perye
 * @Date: 2019-03-26
 */
public interface IScheduleJobService extends IService<ScheduleJobEntity> {

	PageUtils queryPage(Map<String, Object> params);

	/**
	 * 保存定时任务
	 */
    void insert(ScheduleJobEntity scheduleJob);

	/**
	 * 更新定时任务
	 */
	void update(ScheduleJobEntity scheduleJob);

    /**
	 * 批量删除定时任务
	 */
	void deleteBatch(Long[] jobIds);

    /**
	 * 批量更新定时任务状态
	 */
	int updateBatch(Long[] jobIds, int status);

    /**
	 * 立即执行
	 */
	void run(Long[] jobIds);

    /**
	 * 暂停运行
	 */
	void pause(Long[] jobIds);

    /**
	 * 恢复运行
	 */
	void resume(Long[] jobIds);
}
