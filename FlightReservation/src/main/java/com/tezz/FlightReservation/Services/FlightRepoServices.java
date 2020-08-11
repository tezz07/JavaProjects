package com.tezz.FlightReservation.Services;



import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tezz.FlightReservation.entity.Flight;
import com.tezz.FlightReservation.entity.Reservation;
import com.tezz.FlightReservation.repo.FlightRepo;
import com.tezz.FlightReservation.repo.ReservationRepo;

@Service
public class FlightRepoServices {

	@Autowired
	FlightRepo flightRepo;
	
	
//	public List<Flight> serchFlightServices(Flight flight) {
//		// TODO Auto-generated method stub
//		return flightRepo.findAll();
//	}

	public Flight SaveFlights(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepo.save(flight);
	}

	public List<Flight> findFlight(String from, String to, Date departureDate) {
		// TODO Auto-generated method stub
		return flightRepo.findFlight(from,to,departureDate);
	}

	
}
