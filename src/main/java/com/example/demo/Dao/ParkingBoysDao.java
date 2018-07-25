package com.example.demo.Dao;

import com.example.demo.domain.ParkingBoys;
import com.example.demo.domain.ParkingLots;

import java.util.List;

public interface ParkingBoysDao {
    ParkingBoys addParkingBoy(ParkingBoys parkingBoys);

    List<ParkingBoys> getAllParkingBoy();



    //List<ParkingBoys> arrangeParkingLotToBoys(ParkingBoys parkingBoys, int lotId);
}
