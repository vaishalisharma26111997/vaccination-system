package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.VaccinationCenter;
import com.example.demo.Repository.VaccinationCenterRepository;

import Exceptions.VaccinationAddressNotFound;

@Service
public class VaccinationService {
	 @Autowired
	    VaccinationCenterRepository vaccinationCenterRepository;

	    public String addVaccinationCenter(VaccinationCenter vaccinationCenter)throws VaccinationAddressNotFound {

	        if(vaccinationCenter.getAddress()==null){
	            throw new VaccinationAddressNotFound("Vaccination Address is Empty");
	        }

	        vaccinationCenterRepository.save(vaccinationCenter);

	        return "Vaccination center added at a location "+vaccinationCenter.getAddress();

	    }
}
