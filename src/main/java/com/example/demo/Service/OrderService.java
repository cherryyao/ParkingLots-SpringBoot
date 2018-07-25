package com.example.demo.Service;

import com.example.demo.DB;
import com.example.demo.Dao.OrderDao;
import com.example.demo.domain.Car;
import com.example.demo.domain.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderService implements OrderDao {
    @Override
    public Order showOrder(Car car){
        return DB.showOrder(car);
    }
    @Override
    public Car robbing(int orderId){
        return DB.robbing(orderId);
    }

}
