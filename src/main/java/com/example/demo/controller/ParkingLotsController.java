package com.example.demo.controller;

import com.example.demo.Service.ParkingLotsService;
import com.example.demo.domain.ParkingLots;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParkingLotsController {
    @Autowired
    ParkingLotsService parkingLotsService;
    @PostMapping("/ParkingLots")
    public ParkingLots addParkingLot(@RequestBody ParkingLots parkingLots){
        return parkingLotsService.addParkingLot(parkingLots);
    }
    @GetMapping("/ParkingLots")
    public List<ParkingLots> getAllParkingLots(){
        return parkingLotsService.getAllParkingLots();
    }


    @DeleteMapping("/ParkingLots/{lotId}")
    public ParkingLots deleteParkingLots(@PathVariable int lotId){
        return parkingLotsService.deleteParkingLots(lotId);
    }
}
