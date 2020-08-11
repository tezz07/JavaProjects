package com.tezz.FlightReservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tezz.FlightReservation.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

	User findByEmail(String email);

	
	
}
