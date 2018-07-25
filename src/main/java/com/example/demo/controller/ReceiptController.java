package com.example.demo.controller;

import com.example.demo.Service.ReceiptService;
import com.example.demo.domain.Car;
import com.example.demo.domain.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ReceiptController {
    @Autowired
    ReceiptService receiptService;

    @PostMapping("/Receipt")
    public Receipt parking(@RequestBody Car car){
        return receiptService.parking(car);
    }

    @PutMapping("/Receipt/{receiptId}")
    public Car unpark(@PathVariable int receiptId){
        return receiptService.unpark(receiptId);
    }

}
