package com.example.demo.controller;

import com.example.demo.Service.ParkingBoysService;
import com.example.demo.domain.ParkingBoys;
import com.example.demo.domain.ParkingLots;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingBoysController {
    @Autowired
    ParkingBoysService parkingBoysService;

    @PostMapping("/ParkingBoys")
    public List<ParkingBoys> addParkingBoy(@RequestBody ParkingBoys parkingBoys){
        int boyId = parkingBoys.getBoyId();
        String name = parkingBoys.getName();
        List<ParkingLots> parkingLotsList = parkingBoys.getParkingLotsList();
        return parkingBoysService.addParkingBoy(boyId,name,parkingLotsList);

    }
}
