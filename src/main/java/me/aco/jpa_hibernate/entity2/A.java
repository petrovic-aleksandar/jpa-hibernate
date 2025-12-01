package me.aco.jpa_hibernate.entity2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OrderColumn;
import me.aco.jpa_hibernate.entity3.C;

@Entity
public class A {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    public List<String> list = new LinkedList<>();

    @ElementCollection
    @CollectionTable(name = "set_value", joinColumns = @JoinColumn(name = "a_id"))
    public Set<String> set = new HashSet<>();

    @ElementCollection
    @CollectionTable(name = "list_value")
    @OrderColumn(name="list_orderr")
    public List<String> list1 = new LinkedList<>();

    private B b;

    @ElementCollection
    @AttributeOverride(name = "a", column = @jakarta.persistence.Column(name = "aaa"))
    public Set<C> cSet = new HashSet<>();

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
