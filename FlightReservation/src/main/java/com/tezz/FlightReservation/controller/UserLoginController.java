package com.tezz.FlightReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tezz.FlightReservation.Services.UserRepoServices;
import com.tezz.FlightReservation.entity.User;

@RestController
@CrossOrigin
public class UserLoginController {

   @Autowired
   private UserRepoServices userRepoServices;
   
	@GetMapping(path ="/user/{email}/{password}")
	public Object  saveLoginUser(@PathVariable ("email") String email, @PathVariable ("password") String password )
	{	
		
		
	User user= userRepoServices.saveUserLoginDetails(email,password);	 
	if(user.getPassword().equals(password)) {
	return user;
	}
	else {
		
		return "Please Enter Correct PAssword";
	}
	
}
}
