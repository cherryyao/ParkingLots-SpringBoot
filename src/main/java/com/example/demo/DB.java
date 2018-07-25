package com.example.demo;

import com.example.demo.domain.ParkingBoys;
import com.example.demo.domain.ParkingLots;

import java.util.*;

public class DB {
    private static Map<Integer,ParkingBoys> parkingBoysMap = new LinkedHashMap<>();
    private static int parkingBoyIdKey=1;
    private static Map<Integer,ParkingLots> parkingLotsMap = new LinkedHashMap<>();
    private static int getParkingLotIdKey=1;

    public static ParkingBoys addParkingBoys(ParkingBoys parkingBoys){
        parkingBoys.setBoyId(parkingBoyIdKey);
        parkingBoysMap.put(parkingBoyIdKey++,parkingBoys);
        return parkingBoys;
    }
    public static List<ParkingBoys> getAllParkingBoys(){
        return new LinkedList<>(parkingBoysMap.values());
    }
    public static ParkingLots addParkingLots(ParkingLots parkingLots){
        parkingLots.setLotId(getParkingLotIdKey);
        parkingLotsMap.put(getParkingLotIdKey++,parkingLots);
       return parkingLots;
    }

    public static List<ParkingLots> getAllParkingLots(){
        return new LinkedList<>(parkingLotsMap.values());
    }


}
