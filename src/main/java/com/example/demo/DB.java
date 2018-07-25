package com.example.demo;

import com.example.demo.domain.ParkingBoys;

import java.util.*;

public class DB {
    private static Map<Integer,ParkingBoys> parkingBoysMap = new LinkedHashMap<>();
    private static int parkingBoyIdKey=1;

    public static ParkingBoys addParkingBoys(ParkingBoys parkingBoys){
        parkingBoys.setBoyId(parkingBoyIdKey);
        parkingBoysMap.put(parkingBoyIdKey++,parkingBoys);
        return parkingBoys;
    }
    public static List<ParkingBoys> getAllParkingBoys(){
        return new LinkedList<>(parkingBoysMap.values());
    }


}
