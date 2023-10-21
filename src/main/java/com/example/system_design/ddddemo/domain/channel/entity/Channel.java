package com.example.system_design.ddddemo.domain.channel.entity;


public class Channel {
    private int channelId;
    private String channelName;
    private long orderNumber;

    public Channel(int channelId) {
        this.channelId = channelId;
    }

    public boolean validate(){
        return true;
    }

    boolean createOrder(){
        return true;
    }

    boolean cancelOrder(){
        return true;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }
}
