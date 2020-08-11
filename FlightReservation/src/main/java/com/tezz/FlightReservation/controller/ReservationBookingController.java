package com.tezz.FlightReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tezz.FlightReservation.Services.ReservationRequestService;
import com.tezz.FlightReservation.dto.ReservationRequest;

@RestController
@CrossOrigin
public class ReservationBookingController {

	@Autowired
	ReservationRequestService service;
	
	@PostMapping("/saveReservationRequest")
	public String saveReservationRequest(@RequestBody ReservationRequest request) {
		
	return service.saveReservationRequest(request);
			
	}
	
	

}
