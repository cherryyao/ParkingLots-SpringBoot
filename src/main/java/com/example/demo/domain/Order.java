package com.example.demo.domain;

public class Order {
    private int orderId;
    private boolean status;

    public Order(){}

    public Order(int orderId, boolean status) {
        this.orderId = orderId;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
