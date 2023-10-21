package com.example.system_design.ddddemo.domain.channel.service;

import com.example.system_design.ddddemo.domain.channel.entity.Channel;
import com.example.system_design.ddddemo.infrastructure.channel.my.HeiMaoExpress;
import com.example.system_design.ddddemo.infrastructure.channel.sg.ShopeeExpressSG;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public class ChannelAdapter implements ChannelInterface{

    Map<Integer, ChannelInterface> channels = new HashMap<>();

    @PostConstruct
    boolean loadChannels(){
        channels.put(1, new HeiMaoExpress());
        channels.put(2, new ShopeeExpressSG());
        return true;
    }

    @Override
    public boolean createOrder(Channel channel) {
        ChannelInterface realChannel = getChannel(channel);
        return realChannel.createOrder(channel);
    }

    private ChannelInterface getChannel(Channel channel) {
        return channels.get(channel.getChannelId());
    }

    @Override
    public boolean cancelOrder(Channel channel) {
        return false;
    }
}
