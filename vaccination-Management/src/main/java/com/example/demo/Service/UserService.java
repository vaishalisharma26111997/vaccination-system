package com.example.demo.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Enums.Gender;
import com.example.demo.Models.*;

import com.example.demo.Repository.UserRepository;

import RequestDtos.UpdateEmailDto;
@Service
public class UserService {

		
		   @Autowired
		    UserRepository userRepository;
		  

		    public User addUser(User user){

		        user.setGender(Gender.MALE);

		        System.out.println("The user is "+user);
		        user = userRepository.save(user);
		        return user;
		    }

		    public Date getVaccDate(Integer userId){

		        User user = userRepository.findById(userId).get();

		        Dose dose = user.getDose();

		        return dose.getVaccinationDate();
		    }

		    public String updateEmail(UpdateEmailDto updateEmailDto){

		        int userId = updateEmailDto.getUserId();

		        User user = userRepository.findById(userId).get();

		        //Modify the entity with new parameters
		        user.setEmailId(updateEmailDto.getNewEmailId());
		        userRepository.save(user);
		        return "Old Email has been modified with new one "+updateEmailDto.getNewEmailId();
		    }

		    public User getUserByEmail(String email){
		        User user = userRepository.findByEmailId(email);
		        return user;
		    }

}
