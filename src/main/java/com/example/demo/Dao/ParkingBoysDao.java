package com.example.demo.Dao;

import com.example.demo.domain.ParkingBoys;
import com.example.demo.domain.ParkingLots;

import java.util.List;

public interface ParkingBoysDao {
    List<ParkingBoys> addParkingBoy(int boyId, String name);
}
