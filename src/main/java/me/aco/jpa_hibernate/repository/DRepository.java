package me.aco.jpa_hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.aco.jpa_hibernate.entity4.D;

@Repository
public interface DRepository extends JpaRepository<D, Long> {
}
