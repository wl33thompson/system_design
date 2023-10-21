package com.example.system_design.ddddemo.domain.channel.service;


import com.example.system_design.ddddemo.domain.channel.entity.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChannelService implements ChannelInterface{

    @Autowired
    ChannelAdapter channelAdapter;

    @Override
    public boolean createOrder(Channel channel) {
        if (channel.validate())
            return false;

        return channelAdapter.createOrder(channel);

    }

    @Override
    public boolean cancelOrder(Channel channel) {
        return false;
    }
}
