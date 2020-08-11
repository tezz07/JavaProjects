package com.tezz.FlightReservation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tezz.FlightReservation.entity.Reservation;
import com.tezz.FlightReservation.repo.ReservationRepo;

@Service
public class ReservationRepoServices {

	@Autowired
	ReservationRepo reservationRepo;
	
	
	public Object getFlightUsingId(Long flightid) {
		// TODO Auto-generated method stub
		return reservationRepo.findById(flightid);
	}

	
	 
	 public Reservation saveEntity(Reservation reservation) 
	 { 
		 return reservationRepo.save(reservation); 
		}


	public Reservation updateReservation(Long id) {
		// TODO Auto-generated method stub
		return reservationRepo.findById(id).get();
	}
	
	
	
}
