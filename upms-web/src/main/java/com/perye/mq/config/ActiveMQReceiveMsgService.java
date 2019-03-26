package com.perye.mq.config;

import org.springframework.stereotype.Component;

/**
 * ActiveMQ 生产者/消费者模式 消费者服务类 发布/订阅模式  订阅者模式
 * @Author: Perye
 * @Date: 2019-03-26
 */
@Component
public class ActiveMQReceiveMsgService {

    /**
     * 生产者/消费者模式 消费者服务类
     *
     * @param text
     */
    //@JmsListener(destination = "test", containerFactory = "queueJmsListenerContainerFactory", concurrency = "5-10")
    public void receiveMsg(String text) {
        System.out.println("==== 生产者/消费者模式 收到的消息：" + text + " ====");
    }


    /**
     * 发布/订阅模式  订阅者模式
     *
     * @param text
     */
    //@JmsListener(destination = "testTopic", containerFactory = "topicJmsListenerContainerFactory", concurrency = "5-10")
    public void receiveTopicMsg(String text) {
        System.out.println("==== 发布/订阅模式 收到的消息：" + text + " ====");
    }
}
