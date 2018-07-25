package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoys {
    private int boyId;
    private String name;
    private List<ParkingLots> parkingLotsList = new ArrayList<>();

    public ParkingBoys(){}

    public ParkingBoys(int boyId, String name, List<ParkingLots> parkingLotsList) {
        this.boyId = boyId;
        this.name = name;
        this.parkingLotsList = parkingLotsList;
    }

    public int getBoyId() {
        return boyId;
    }

    public void setBoyId(int boyId) {
        this.boyId = boyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingLots> getParkingLotsList() {
        return parkingLotsList;
    }

    public void setParkingLotsList(List<ParkingLots> parkingLotsList) {
        this.parkingLotsList = parkingLotsList;
    }
}
