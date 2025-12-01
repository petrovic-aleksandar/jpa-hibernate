package me.aco.jpa_hibernate.entity3;

import org.hibernate.annotations.Parent;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Transient;
import me.aco.jpa_hibernate.entity2.A;

@Embeddable
public class C {

    @Parent
    @Transient
    private A aEntity;

    public int a;
    public int b;

    public A getAEntity() {
        return aEntity;
    }
    
}
