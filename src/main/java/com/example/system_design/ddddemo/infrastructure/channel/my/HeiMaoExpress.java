package com.example.system_design.ddddemo.infrastructure.channel.my;


import com.example.system_design.ddddemo.domain.channel.entity.Channel;
import com.example.system_design.ddddemo.domain.channel.service.ChannelInterface;

public class HeiMaoExpress implements ChannelInterface {
    @Override
    public boolean createOrder(Channel channel) {
        System.out.println("HeiMaoExpress createOrder");
        return true;
    }

    @Override
    public boolean cancelOrder(Channel channel) {
        System.out.println("HeiMaoExpress cancelOrder");
        return true;
    }
}
