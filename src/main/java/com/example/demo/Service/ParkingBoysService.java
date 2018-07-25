package com.example.demo.Service;

import com.example.demo.DB;
import com.example.demo.Dao.ParkingBoysDao;
import com.example.demo.domain.ParkingBoys;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ParkingBoysService implements ParkingBoysDao {


    @Override
    public ParkingBoys addParkingBoy(ParkingBoys parkingBoys){
        return DB.addParkingBoys(parkingBoys);
    }

    @Override
    public  List<ParkingBoys> getAllParkingBoy(){
        return DB.getAllParkingBoys();
    }


}
