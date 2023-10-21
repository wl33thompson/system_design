package com.example.system_design.ddddemo.infrastructure.repository.mybatis;

import com.example.system_design.ddddemo.domain.channel.dao.ChannelOrderDO;
import com.example.system_design.ddddemo.domain.channel.entity.Channel;
import com.example.system_design.ddddemo.domain.channel.repository.AbstractChannelRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ChannelRepositoryMybatis extends AbstractChannelRepository {
    @Override
    public boolean saveOrder(Channel channel) {
        ChannelOrderDO channelOrderDO = getDO(channel);
        System.out.println("ChannelRepositoryMybatis" + channelOrderDO);
        return true;
    }
}
