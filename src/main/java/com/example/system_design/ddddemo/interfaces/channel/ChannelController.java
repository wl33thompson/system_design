package com.example.system_design.ddddemo.interfaces.channel;

import com.example.system_design.ddddemo.application.channel.ChannelApplicationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController {

    @Autowired
    ChannelApplicationInterface channelApplicationInterface;

    @GetMapping("/create_channel/{id}")
    boolean createChannel(@PathVariable("id") Integer id) {
        return channelApplicationInterface.createOrder(id, null);
    }

//        @GetMapping("/data/{id}")
//        public String getData(@PathVariable("id") String id) {
//            // Process the id parameter and return a response
//            return "Requested data for ID: " + id;
//        }
}
