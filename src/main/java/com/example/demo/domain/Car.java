package com.example.demo.domain;

public class Car {
    private String carId;
    public Car(){}

    public Car(String carId) {
        this.carId = carId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
}
