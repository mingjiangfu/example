package com.rabbitmq.demo.client.comsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author fumj
 * @projectName example
 * @description: 消费队列
 * @date 2020/4/1618:00
 */
@Component
@Slf4j
@EnableRabbit
public class OrderBillingReceiver {


    @RabbitListener(queues = "${mq.queue}")
    @RabbitHandler
    public void process(String message){
        log.info("receive message:{}",message);
    }
}
