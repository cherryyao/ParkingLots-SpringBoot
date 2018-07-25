package com.example.demo.Dao;

import com.example.demo.domain.Car;
import com.example.demo.domain.Receipt;

public interface ReceiptDao {
    Receipt parking(Car car);
}
