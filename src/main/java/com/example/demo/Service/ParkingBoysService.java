package com.example.demo.Service;

import com.example.demo.Dao.ParkingBoysDao;
import com.example.demo.domain.ParkingBoys;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ParkingBoysService implements ParkingBoysDao {
    private List<ParkingBoys> parkingBoysList = new ArrayList<>();



    @Override
    public List<ParkingBoys> addParkingBoy(int boyId, String name){
        parkingBoysList.add(new ParkingBoys(boyId,name));
        return parkingBoysList;
    }

}
