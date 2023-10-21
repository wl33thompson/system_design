package com.example.system_design.ddddemo.application.channel;

import com.example.system_design.ddddemo.domain.channel.entity.Channel;
import com.example.system_design.ddddemo.domain.channel.repository.ChannelRepository;
import com.example.system_design.ddddemo.domain.channel.service.ChannelInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ChannelOrderService implements ChannelApplicationInterface {

    @Autowired
    @Qualifier("channelAdapter")
    ChannelInterface channelService;

    @Autowired
//    @Qualifier("channelRepositorySpringJDBC")
    @Qualifier("channelRepositoryMybatis")
    ChannelRepository channelRepository;

    @Override
    public boolean createOrder(int channelId, String channelInfo) {
        Channel channel = new Channel(channelId);
        channel.validate();

        boolean result = false;
        result = channelService.createOrder(channel);
        if (!result)
            return false;

        result = channelRepository.saveOrder(channel);
        if (!result)
            return false;

        return true;
    }
}
