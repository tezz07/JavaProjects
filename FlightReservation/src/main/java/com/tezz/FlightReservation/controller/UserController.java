package com.tezz.FlightReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tezz.FlightReservation.Services.UserRepoServices;
import com.tezz.FlightReservation.entity.User;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private UserRepoServices userRepoServices;
	
	@PostMapping(path = "/user")
	public User  saveUser(@RequestBody User user) {
		
		return userRepoServices.saveUserDetails(user);
				
		
	}
	
	
	
	
}
