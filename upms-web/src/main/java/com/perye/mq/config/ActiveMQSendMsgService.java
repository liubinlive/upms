package com.perye.mq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.io.Serializable;

/**
 * ActiveMQ 生产者服务类
 * @Author: Perye
 * @Date: 2019-03-26
 */
@Component
public class ActiveMQSendMsgService {

    @Resource
    private JmsTemplate jmsTemplate;

    /**
     * 生产者/消费者模式
     * 发送消息
     *
     * @param queueName 队列名称
     * @param message   消息
     */
    public void sendMessage(final String queueName, final String message) {
        Destination mQueue = new ActiveMQQueue(queueName);
        jmsTemplate.send(mQueue, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
    }

    /**
     * 生产者/消费者模式
     * 发送消息
     *
     * @param queueName 队列名称
     * @param obj       对象
     */
    public void sendObjectMessage(final String queueName, final Serializable obj) {
        Destination mQueue = new ActiveMQQueue(queueName);
        jmsTemplate.send(mQueue, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage(obj);
            }
        });
    }


    public void delaySend(final String queueName, final Serializable obj) {
        Destination mQueue = new ActiveMQQueue(queueName);
        jmsTemplate.send(mQueue, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage(obj);
            }
        });
    }


    /**
     * 订阅模式
     * 发送消息
     *
     * @param topicName topic名称
     * @param obj
     */
    public void sendObjectMessageOfTopic(final String topicName, final Serializable obj) {
        Destination mQueue = new ActiveMQTopic(topicName);
        jmsTemplate.send(mQueue, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage(obj);
            }
        });
    }
}
