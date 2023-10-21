package com.example.system_design.ddddemo.infrastructure.repository.spring;

import com.example.system_design.ddddemo.domain.channel.dao.ChannelOrderDO;
import com.example.system_design.ddddemo.domain.channel.entity.Channel;
import com.example.system_design.ddddemo.domain.channel.repository.AbstractChannelRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ChannelRepositorySpringJDBC extends AbstractChannelRepository {
    @Override
    public boolean saveOrder(Channel channel) {
        ChannelOrderDO channelOrderDO = getDO(channel);
        System.out.println("ChannelRepositorySpringJDBC" + channelOrderDO);
        return true;
    }
}
