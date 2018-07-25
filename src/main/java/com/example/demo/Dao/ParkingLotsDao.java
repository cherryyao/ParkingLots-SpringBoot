package com.example.demo.Dao;

import com.example.demo.domain.ParkingLots;

import java.util.List;

public interface ParkingLotsDao {
    ParkingLots addParkingLot(ParkingLots parkingLots);
    List<ParkingLots> getAllParkingLots();

    ParkingLots deleteParkingLots(int lotId);
}
