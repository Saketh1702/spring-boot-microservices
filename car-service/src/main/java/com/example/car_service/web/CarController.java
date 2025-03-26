package com.example.car_service.web;

import com.example.car_service.data.Car;
import com.example.car_service.data.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class CarController {

    private final CarRepository repository;

    public CarController(CarRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return repository.findAll();
    }
}