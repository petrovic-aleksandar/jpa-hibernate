package me.aco.jpa_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.aco.jpa_hibernate.entity4.D1;

@Repository
public interface D1Repository extends JpaRepository<D1, Long> {
}
