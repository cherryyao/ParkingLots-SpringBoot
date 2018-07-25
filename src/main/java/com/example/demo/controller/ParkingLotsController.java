package com.example.demo.controller;

import com.example.demo.Service.ParkingLotsService;
import com.example.demo.domain.ParkingLots;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingLotsController {
    @Autowired
    ParkingLotsService parkingLotsService;
    @PostMapping("/ParkingLots")
    public List<ParkingLots> addParkingLot(@RequestBody ParkingLots parkingLots){
        int lotId = parkingLots.getLotId();
        String lotName = parkingLots.getLotName();
        int size = parkingLots.getSize();
        return parkingLotsService.addParkingLot(lotId,lotName,size);

    }
}
