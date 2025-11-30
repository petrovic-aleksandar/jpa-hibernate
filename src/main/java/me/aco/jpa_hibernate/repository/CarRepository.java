package me.aco.jpa_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.aco.jpa_hibernate.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
