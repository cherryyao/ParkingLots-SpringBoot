package com.example.demo.domain;

import java.util.ArrayList;

public class ParkingLots {
    private int LotId;
    private String LotName;
    private int size;

    public ParkingLots(int lotId, String lotName, int size) {
        LotId = lotId;
        LotName = lotName;
        this.size = size;
    }

    public ParkingLots(){}

    public int getLotId() {
        return LotId;
    }

    public void setLotId(int lotId) {
        LotId = lotId;
    }

    public String getLotName() {
        return LotName;
    }

    public void setLotName(String lotName) {
        LotName = lotName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
