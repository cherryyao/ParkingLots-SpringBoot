package com.example.demo.Service;

import com.example.demo.Dao.ParkingBoysDao;
import com.example.demo.domain.ParkingBoys;
import com.example.demo.domain.ParkingLots;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ParkingBoysService implements ParkingBoysDao {
    private List<ParkingBoys> CompaniesList = new ArrayList<>();



    @Override
    public List<ParkingBoys> addParkingBoy(int boyId, String name, List<ParkingLots> parkingLotsList){
        CompaniesList.add(new ParkingBoys(boyId,name,parkingLotsList));
        return CompaniesList;
    }

}
