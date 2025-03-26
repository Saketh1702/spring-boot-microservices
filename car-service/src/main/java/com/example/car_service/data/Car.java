package com.example.carservice,.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
public class Car {
    public Car() {
    }

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    public Car(String name) {
        this.name = name
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" + 
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
} 