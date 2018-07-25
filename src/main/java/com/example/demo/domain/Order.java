package com.example.demo.domain;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Order {
    private int OrderId;
    private boolean status;

    public Order(){}

    public Order(int orderId, boolean status) {
        OrderId = orderId;
        this.status = status;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
