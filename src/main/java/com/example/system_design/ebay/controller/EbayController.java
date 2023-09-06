package com.example.system_design.ebay.controller;

import com.example.system_design.ebay.service.EbayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ebay/api")
public class EbayController {

    @Autowired
    EbayService ebayService;

    @GetMapping("/access_times_stirng")
    String getAccessTimesString(@RequestParam("userId") long userId, @RequestParam("ip") int ip, @RequestParam("orderNumber") long orderNumber) {
        return userId + " " + ip + " " + orderNumber;
    }

    @GetMapping("/access_times")
    int getAccessTimes(@RequestParam("user_id") long userId, @RequestParam("ip") int ip, @RequestParam("order_number") long orderNumber) {
        return ebayService.getAccessTimes(userId, ip, orderNumber);
    }
}
