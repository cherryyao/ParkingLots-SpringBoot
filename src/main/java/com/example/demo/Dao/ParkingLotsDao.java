package com.example.demo.Dao;

import com.example.demo.domain.ParkingLots;

import java.util.List;

public interface ParkingLotsDao {
    List<ParkingLots> addParkingLot(int lotId, String lotname, int size);
}
