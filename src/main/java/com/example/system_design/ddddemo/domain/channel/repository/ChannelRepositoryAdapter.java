package com.example.system_design.ddddemo.domain.channel.repository;

import com.example.system_design.ddddemo.domain.channel.entity.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class ChannelRepositoryAdapter implements ChannelRepository{

    @Autowired
    @Qualifier("channelRepositoryMybatis")
    AbstractChannelRepository abstractChannelRepository;

    @Override
    public boolean saveOrder(Channel channel) {
        abstractChannelRepository.saveOrder(channel);
        return false;
    }
}
