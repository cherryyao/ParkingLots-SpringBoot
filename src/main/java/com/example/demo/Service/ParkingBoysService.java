package com.example.demo.Service;

import com.example.demo.DB;
import com.example.demo.Dao.ParkingBoysDao;
import com.example.demo.domain.ParkingBoys;
import com.example.demo.domain.ParkingLots;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
@Component
public class ParkingBoysService implements ParkingBoysDao {
    private List<ParkingBoys> parkingBoysList = new ArrayList<>();


    @Override
    public ParkingBoys addParkingBoy(ParkingBoys parkingBoys){
        return DB.addParkingBoys(parkingBoys);
    }

    @Override
    public  List<ParkingBoys> getAllParkingBoy(){
        return DB.getAllParkingBoys();
    }


}
