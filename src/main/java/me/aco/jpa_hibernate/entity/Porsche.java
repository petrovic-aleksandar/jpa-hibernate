package me.aco.jpa_hibernate.entity;

import jakarta.persistence.Entity;

@Entity
public class Porsche extends Car {

    String pModel;

    public String getpModel() {
        return pModel;
    }

    public void setpModel(String pModel) {
        this.pModel = pModel;
    }
}