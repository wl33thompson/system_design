package com.example.system_design.controller.rabbitmq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

//@Component
public class RabbitMQConsumer implements ChannelAwareMessageListener {

    @Override
    @RabbitListener(queues = "test")
    public void onMessage(Message message, Channel channel) throws Exception {
        try {
            // Process the message

            String mess  = new String(message.getBody());
            System.out.println(Thread.currentThread().getName()+" Received message: " + mess);

            if (mess.equals("not")){
                channel.basicNack(message.getMessageProperties().getDeliveryTag(), false,true);
                System.out.println("reject");
                return;
            }

            // Manually acknowledge the message
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (Exception e) {
            System.out.println("error");
            // Handle any exception that occurred during message processing
            e.printStackTrace();

            // Manually reject or nack the message
            channel.basicReject(message.getMessageProperties().getDeliveryTag(), false);
        }
    }
}