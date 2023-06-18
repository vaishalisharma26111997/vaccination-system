package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.User;
import com.example.demo.Models.Dose;
import com.example.demo.Repository.DoseRepository;
import com.example.demo.Repository.UserRepository;

@Service
public class DoseService {
  
	@Autowired
	DoseRepository doseRepository;
	@Autowired
	UserRepository userRepository;
	public String giveDose(String doseId, Integer userId) {
		
		//An Entity of that model has been created
        //This entity will be saved in the database
		User user=userRepository.findById(userId).get();
		Dose dose=new Dose();
		//setting its attributes
		dose.setDoseId(doseId);
		dose.setUser(user);
		
		//Setting the child object in that corresponding
        user.setDose(dose);
        //Child will automatically get saved because of cascading effect.

		userRepository.save(user);
		return "dose given to particular user";
		
	}

}
