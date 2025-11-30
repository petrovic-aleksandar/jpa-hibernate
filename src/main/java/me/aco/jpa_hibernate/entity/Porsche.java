package me.aco.jpa_hibernate.entity;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Entity;

@Entity
public class Porsche extends Car {

    private String pModel;

    @JdbcTypeCode(SqlTypes.CHAR)
    private boolean isTurbo;

    public boolean isTurbo() {
        return isTurbo;
    }

    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }

    public String getpModel() {
        return pModel;
    }

    public void setpModel(String pModel) {
        this.pModel = pModel;
    }
}