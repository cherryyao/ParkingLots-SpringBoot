package com.example.demo.domain;

public class ParkingLots {
    private int lotId;
    private String lotName;
    private int size;

    public ParkingLots(int lotId, String lotName, int size) {
        this.lotId = lotId;
        this.lotName = lotName;
        this.size = size;
    }

    public ParkingLots(int lotId){
        this.lotId = lotId;
    }

    public ParkingLots(){}

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public String getLotName() {
        return lotName;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
