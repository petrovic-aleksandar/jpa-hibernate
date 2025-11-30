package me.aco.jpa_hibernate.entity2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class A {

    @Id
    private Long id;

    private String name;
    private String description;

    private B b;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
