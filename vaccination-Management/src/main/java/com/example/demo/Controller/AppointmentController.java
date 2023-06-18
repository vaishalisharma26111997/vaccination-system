package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.AppointmentService;

import RequestDtos.AppointmentReqDto;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	   @Autowired
	    AppointmentService appointmentService;

	    @PostMapping("/book")
	    public String bookAppointment(@RequestBody AppointmentReqDto appointmentReqDto){

	        try {
	            String result = appointmentService.bookAppointment(appointmentReqDto);
	            return result;
	        } catch (Exception e){
	            return e.getMessage();
	        }
	    }
}
