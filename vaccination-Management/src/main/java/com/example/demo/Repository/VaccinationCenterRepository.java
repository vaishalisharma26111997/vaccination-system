package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.VaccinationCenter;

public interface VaccinationCenterRepository extends JpaRepository<VaccinationCenter,Integer>{

}
