package com.example.system_design.ebay.service;

public interface EbayService {
    int getAccessTimes(long userId, int ip, long orderNumber);

}