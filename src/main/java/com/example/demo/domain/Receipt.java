package com.example.demo.domain;

public class Receipt {
    private int receiptId;

    public Receipt(int receiptId) {
        this.receiptId = receiptId;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }
}
