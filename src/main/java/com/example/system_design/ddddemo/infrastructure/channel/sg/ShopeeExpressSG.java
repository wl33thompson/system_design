package com.example.system_design.ddddemo.infrastructure.channel.sg;


import com.example.system_design.ddddemo.domain.channel.entity.Channel;
import com.example.system_design.ddddemo.domain.channel.service.ChannelInterface;

public class ShopeeExpressSG implements ChannelInterface {
    @Override
    public boolean createOrder(Channel channel) {
        System.out.println("ShopeeExpressSG createOrder");
        return true;
    }

    @Override
    public boolean cancelOrder(Channel channel) {
        System.out.println("ShopeeExpressSG cancelOrder");
        return true;
    }
}
