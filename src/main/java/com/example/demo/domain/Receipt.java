package com.example.demo.domain;

public class Receipt {
    private int receiptId;
    private boolean status;

    public Receipt(int receiptId) {
        this.receiptId = receiptId;
    }

    public Receipt(int receiptId, boolean status) {
        this.receiptId = receiptId;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(int receiptId) {
        this.receiptId = receiptId;
    }
}
