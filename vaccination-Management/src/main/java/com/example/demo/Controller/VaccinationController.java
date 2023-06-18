package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.VaccinationCenter;
import com.example.demo.Service.VaccinationService;

import Exceptions.VaccinationAddressNotFound;

@RestController
@RequestMapping("/vaccinationCenter")
public class VaccinationController {
	 @Autowired
	    public VaccinationService vaccinationService;

	    @PostMapping("/add")
	    public ResponseEntity<String> addCenter(@RequestBody VaccinationCenter vaccinationCenter){

	        try {
	            String result = vaccinationService.addVaccinationCenter(vaccinationCenter);
	            return new ResponseEntity<>(result, HttpStatus.OK);
	        } catch (VaccinationAddressNotFound e) {
	            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	        }

	    }
}
