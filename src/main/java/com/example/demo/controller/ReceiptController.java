package com.example.demo.controller;

import com.example.demo.Service.ReceiptService;
import com.example.demo.domain.Car;
import com.example.demo.domain.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiptController {
    @Autowired
    ReceiptService receiptService;

    @PostMapping("/Receipt")
    public Receipt parking(Car car){

        return receiptService.parking(car);
    }

}
