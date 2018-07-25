package com.example.demo.controller;

import com.example.demo.Service.OrderService;
import com.example.demo.domain.Car;
import com.example.demo.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/Order")
    public Order showOrder(@RequestBody Car car){
        return orderService.showOrder(car);
    }

    @PutMapping("/Order/{orderId}")
    public Car robbing(@PathVariable int orderId){
        return orderService.robbing(orderId);
    }

}
