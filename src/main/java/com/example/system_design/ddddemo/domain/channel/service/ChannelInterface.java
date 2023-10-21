package com.example.system_design.ddddemo.domain.channel.service;


import com.example.system_design.ddddemo.domain.channel.entity.Channel;

public interface ChannelInterface {
    boolean createOrder(Channel channel);
    boolean cancelOrder(Channel channel);
}
