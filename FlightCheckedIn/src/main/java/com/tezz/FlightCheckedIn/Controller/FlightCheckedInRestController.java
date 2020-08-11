package com.tezz.FlightCheckedIn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tezz.FlightCheckedIn.Controller.dto.ReservationUpdateRequest;
import com.tezz.FlightCheckedIn.entity.Reservation;

@RestController
public interface FlightCheckedInRestController {

	@GetMapping("getReservation/{id}")
	public Reservation findReservation(@PathVariable("id") Long id);
	
	@PutMapping
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest reservationUpdateRequest); 
	
	
	
}
