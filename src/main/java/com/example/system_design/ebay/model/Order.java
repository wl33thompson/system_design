package com.example.system_design.ebay.model;


public class Order {
    private long userId;
    private int ip;
    private long orderNumber;

    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", ip=" + ip +
                ", orderNumber=" + orderNumber +
                '}';
    }

    public Order(long userId, int ip, long orderNumber) {
        this.userId = userId;
        this.ip = ip;
        this.orderNumber = orderNumber;
    }
}
