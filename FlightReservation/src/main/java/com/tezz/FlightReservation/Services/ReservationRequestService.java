package com.tezz.FlightReservation.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tezz.FlightReservation.dto.ReservationRequest;
import com.tezz.FlightReservation.entity.Flight;
import com.tezz.FlightReservation.entity.Passenger;
import com.tezz.FlightReservation.entity.Reservation;
import com.tezz.FlightReservation.repo.FlightRepo;
import com.tezz.FlightReservation.repo.PassengerRepo;
import com.tezz.FlightReservation.repo.ReservationRepo;

@Service
public class ReservationRequestService {

	
	@Autowired
	FlightRepo flightRepo;
	
	@Autowired
	PassengerRepo passengerRepo;
	
	@Autowired
	ReservationRepo reservationRepo;
	
	
	public String saveReservationRequest(ReservationRequest request) {
		// TODO Auto-generated method stub
	
		Long flightid =request.getFlightId();
		
	Flight flight	=flightRepo.getFlightObjectUsingId(flightid);
		
	Passenger passenger = new Passenger();
	
	passenger.setFirstName(request.getPassengerfirstName());
	passenger.setMiddleName(request.getPassengermiddleName());
	passenger.setLastName(request.getPassengerlastName());
	passenger.setEmail(request.getPassengeremail());
	passenger.setPhone(request.getPassengerphone());
	Passenger savedPassenger = passengerRepo.save(passenger);
	
    
    
    Reservation reservation = new Reservation();
    
    reservation.setFlight(flight);
    reservation.setPassenger(savedPassenger);
    reservation.setCheckedIn(false);
    reservationRepo.save(reservation);
    
    
    return "Your Reservation is completed"+request.getFlightId();
	}

}
