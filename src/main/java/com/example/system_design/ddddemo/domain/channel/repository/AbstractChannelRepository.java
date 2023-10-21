package com.example.system_design.ddddemo.domain.channel.repository;


import com.example.system_design.ddddemo.domain.channel.dao.ChannelOrderDO;
import com.example.system_design.ddddemo.domain.channel.entity.Channel;

public abstract class AbstractChannelRepository implements ChannelRepository, Repository<Channel, ChannelOrderDO> {
    public ChannelOrderDO getDO(Channel channel) {
        return new ChannelOrderDO();
    }
}
