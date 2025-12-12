package me.aco.jpa_hibernate.entity4;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class D {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@OneToOne(cascade = CascadeType.ALL)
    @OneToOne
    @PrimaryKeyJoinColumn
    private D1 d1;

    public Long getId() {
        return id;
    }

    public D1 getD1() {
        return d1;
    }   

    public void setD1(D1 d1) {
        this.d1 = d1;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
