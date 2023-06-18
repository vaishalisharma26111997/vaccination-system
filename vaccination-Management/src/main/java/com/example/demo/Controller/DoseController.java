package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DoseService;

@RestController
@RequestMapping("/dose")
public class DoseController {
	@Autowired
	DoseService doseService;
	@PostMapping("/giveDose")
	public String giveDose(@RequestParam("doseId")String doseId,@RequestParam("userId")Integer userId){

        return doseService.giveDose(doseId,userId);
    }

}
