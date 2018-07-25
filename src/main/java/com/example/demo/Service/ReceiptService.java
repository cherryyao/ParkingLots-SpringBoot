package com.example.demo.Service;

import com.example.demo.DB;
import com.example.demo.Dao.ReceiptDao;
import com.example.demo.domain.Car;
import com.example.demo.domain.Receipt;
import org.springframework.stereotype.Component;

@Component
public class ReceiptService implements ReceiptDao {
    @Override
    public Receipt parking(Car car){
        return DB.parking(car);
    }

}
