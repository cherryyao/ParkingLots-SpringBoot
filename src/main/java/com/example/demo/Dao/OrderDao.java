package com.example.demo.Dao;

import com.example.demo.domain.Car;
import com.example.demo.domain.Order;

public interface OrderDao {
    Order showOrder(Car car);

    Car robbing(int receiptId);
}
