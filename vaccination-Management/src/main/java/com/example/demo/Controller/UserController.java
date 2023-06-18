package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
   
	@Autowired
	UserService userService;
	@PostMapping("/add")
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
}
