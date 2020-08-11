package com.tezz.FlightReservation.controller.checkedIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tezz.FlightReservation.Services.ReservationRepoServices;
import com.tezz.FlightReservation.dto.ReservationUpdateRequest;
import com.tezz.FlightReservation.entity.Reservation;

@RestController 
public class FlightReservationCheckedIn {

	@Autowired
	ReservationRepoServices reserServices;
	
	@GetMapping("completeFlightBooking/{id}")
	public Object getFlightUsingId(@PathVariable("id") Long flightid) {
		return reserServices.getFlightUsingId(flightid);
		
		
	}
	
	
	@PutMapping("updateReservation")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest reservationUpdateRequest ) {
		
		Reservation reservation = reserServices.updateReservation(reservationUpdateRequest.getId());
		
	reservation.setNumberOfBags(reservationUpdateRequest.getNumberOfBags());
		reservation.setCheckedIn(reservationUpdateRequest.getCheckedIn());
		return reserServices.saveEntity(reservation);
			
	}
	
}
