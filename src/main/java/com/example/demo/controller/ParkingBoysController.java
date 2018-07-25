package com.example.demo.controller;

import com.example.demo.Service.ParkingBoysService;
import com.example.demo.Service.ParkingLotsService;
import com.example.demo.domain.ParkingBoys;
import com.example.demo.domain.ParkingLots;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ParkingBoysController {
    @Autowired
    ParkingBoysService parkingBoysService;

    @PostMapping("/ParkingBoys")
    public ParkingBoys addParkingBoy(@RequestBody ParkingBoys parkingBoys){
        return parkingBoysService.addParkingBoy(parkingBoys);
    }

    @GetMapping("/ParkingBoys")
    public List<ParkingBoys> getAllParkingBoy(){
        return parkingBoysService.getAllParkingBoy();
    }

//    @PutMapping("/ParkingBoys/{lotId}")
//    public List<ParkingBoys> arrangeParkingLotToBoys(@PathVariable int lotId,@RequestBody ParkingBoys parkingBoys){
//
////        List<ParkingLots> parkingLotsList =new ArrayList<>();
////        parkingLotsList.add(new ParkingLots(lotId));
//        ParkingLotsService parkingLotsService = new ParkingLotsService();
//
//        return parkingBoysService.arrangeParkingLotToBoys(parkingBoys,lotId);
//    }
}
