package me.aco.jpa_hibernate.entity;

import jakarta.persistence.Entity;

@Entity
public class Audi extends Car {

    private String model;
    private int year;

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
}