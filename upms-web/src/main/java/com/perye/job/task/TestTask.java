package com.perye.job.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * 测试定时任务
 * @Author: Perye
 * @Date: 2019-03-26
 */
@Component("testTask")
public class TestTask {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AsyncTask task;


    public void test(String params) {
        logger.info("我是带参数的test方法，正在被执行，参数为：" + params);

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void test2() {
        logger.info("我是不带参数的test2方法，正在被执行");
    }


    public void test3(String params) throws Exception {
        logger.info("我是带参数的test3异步方法，正在被执行，参数为：" + params);
        long start = System.currentTimeMillis();
        Future<String> task1 = task.doTaskOne();
        Future<String> task2 = task.doTaskTwo();
        Future<String> task3 = task.doTaskThree();
        while (true) {
            if (task1.isDone() && task2.isDone() && task3.isDone()) {
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        logger.info("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }

    public void test4() {
        logger.info("傻逼");
    }
}
