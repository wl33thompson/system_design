package com.example.system_design.ddddemo.domain.channel.repository;


import com.example.system_design.ddddemo.domain.channel.entity.Channel;

public interface ChannelRepository {
    boolean saveOrder(Channel channel);
}
