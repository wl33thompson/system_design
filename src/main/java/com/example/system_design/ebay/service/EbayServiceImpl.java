package com.example.system_design.ebay.service;

import org.redisson.api.RBloomFilter;
import org.redisson.api.RBucket;
import org.redisson.api.RScoredSortedSet;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EbayServiceImpl implements EbayService {

    @Autowired
    RedissonClient redissonClient;

    @Override
    public int getAccessTimes(long userId, int ip, long orderNumber) {
        RScoredSortedSet<String> sortedSet = redissonClient.getScoredSortedSet(userId + "");
        if (sortedSet.contains(orderNumber + "")) {
            return sortedSet.getScore(orderNumber + "").intValue();
        }

        int currentTime = (int) (System.currentTimeMillis() / 1000);
        sortedSet.add(currentTime, orderNumber + "");
        return currentTime;

    }

}
