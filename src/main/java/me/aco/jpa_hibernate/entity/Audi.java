package me.aco.jpa_hibernate.entity;

import jakarta.persistence.Entity;

@Entity
public class Audi extends Car {

    private String model;
    private int year;

    private String manufacturer;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}