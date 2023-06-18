package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Dose;

@Repository
public interface DoseRepository extends JpaRepository<Dose, Integer> {

}
