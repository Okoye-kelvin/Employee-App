package com.example.vehicleinventorymanagementsystem.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String make;
    private String model;
    private String registrationNumber;
    private int year;
    private String color;

    // Constructors
    public Vehicle() {}

    public Vehicle(String make, String model, String registrationNumber, int year, String color) {
        this.make = make;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.year = year;
        this.color = color;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
