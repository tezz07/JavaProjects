package com.tezz.FlightReservation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tezz.FlightReservation.entity.User;
import com.tezz.FlightReservation.repo.UserRepo;


@Service
public class UserRepoServices {

	@Autowired
    private	UserRepo userRepo;
	
	public User saveUserDetails(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	

	public User saveUserLoginDetails( String email, String password) {
		
	return userRepo.findByEmail(email);
	
	}

}
