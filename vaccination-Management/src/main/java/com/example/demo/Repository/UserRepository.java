package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	 //Just define the function to execute :
    User findByEmailId(String emailId);
    //prebuilt functions : and you can use it directly....

    //Imp thing is you have to define those functions....
}
