package com.example.system_design.controller.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class KafkaMessageConsumer {

    @KafkaListener(topics = "my-topic-2")
    public void deviceFlowListen(List<ConsumerRecord> records, Acknowledgment ack) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " records.size : " + records.size());
        try {
            for (ConsumerRecord record : records) {
                System.out.println(record.toString());
            }

        } catch (Exception e) {
            System.out.println("----设备流水数据消费者解析数据异常:{}" + e.getMessage());
        } finally {
            //手动提交偏移量
            Thread.sleep(10000);
            ack.acknowledge();
        }
    }

}