package com.example.demo;

import com.example.demo.domain.Car;
import com.example.demo.domain.ParkingBoys;
import com.example.demo.domain.ParkingLots;
import com.example.demo.domain.Receipt;

import java.util.*;

public class DB {
    private static Map<Integer,ParkingBoys> parkingBoysMap = new LinkedHashMap<>();
    private static int parkingBoyIdKey=1;
    private static Map<Integer,ParkingLots> parkingLotsMap = new LinkedHashMap<>();
    private static int getParkingLotIdKey=1;
    private static Map<Integer,Car> CarMap = new LinkedHashMap<>();
    private static int receiptIdKey = 1;

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


    public static ParkingBoys arrangeParkingLotToParkingBoy(int boyId, int lotId) {
        ParkingBoys parkingBoys = parkingBoysMap.get(boyId);
        ParkingLots parkingLots = parkingLotsMap.get(lotId);
        List<ParkingLots> parkingLotsList = new ArrayList<>();
        parkingLotsList.add(parkingLots);
        parkingBoys.setParkingLotsList(parkingLotsList);
        return parkingBoys;
    }

    public static ParkingBoys deleteParkingBoy(int boyId) {
        ParkingBoys deleteBoy = parkingBoysMap.get(boyId);
        parkingBoysMap.remove(boyId);
        return deleteBoy;
    }

    public static ParkingLots deleteParkingLot(int lotId) {
        ParkingLots deleteLot = parkingLotsMap.get(lotId);
        parkingLotsMap.remove(lotId);
        return deleteLot;
    }

    public static Receipt parking(Car car) {
        Receipt receipt = new Receipt(receiptIdKey);
        CarMap.put(receiptIdKey++,car);
        return receipt;
    }
}
