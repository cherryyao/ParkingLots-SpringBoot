package com.example.demo.Service;

import com.example.demo.DB;
import com.example.demo.Dao.ParkingLotsDao;
import com.example.demo.domain.ParkingBoys;
import com.example.demo.domain.ParkingLots;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ParkingLotsService implements ParkingLotsDao {
    @Override
    public ParkingLots addParkingLot(ParkingLots parkingLots){
        return DB.addParkingLots(parkingLots);
    }
    @Override
    public List<ParkingLots> getAllParkingLots(){
        return DB.getAllParkingLots();
    }



}
