package com.example.demo.Service;

import com.example.demo.Dao.ParkingLotsDao;
import com.example.demo.domain.ParkingLots;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ParkingLotsService implements ParkingLotsDao {

    private List<ParkingLots> parkingLotsList = new ArrayList<>();

    @Override
    public List<ParkingLots> addParkingLot(int lotId, String lotName, int size){
        parkingLotsList.add(new ParkingLots(lotId,lotName,size));
        return parkingLotsList;
    }

}
