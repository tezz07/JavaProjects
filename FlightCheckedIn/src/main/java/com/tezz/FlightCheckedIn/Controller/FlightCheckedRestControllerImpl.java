package com.tezz.FlightCheckedIn.Controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tezz.FlightCheckedIn.Controller.dto.ReservationUpdateRequest;
import com.tezz.FlightCheckedIn.entity.Reservation;
@Service
public class FlightCheckedRestControllerImpl implements FlightCheckedInRestController {

	@Override
	public Reservation findReservation(Long id) {
		// TODO Auto-generated method stub
		
		
		
      Reservation reservation = new RestTemplate()
    		  .getForObject("http://localhost:8080/FlightReservation/completeFlightBooking/"+id, Reservation.class);
		
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest reservationUpdateRequest) {
		
		
		
	Reservation reservation	=new RestTemplate().
			postForObject("http://localhost:8080/FlightReservation/updateReservation", reservationUpdateRequest, Reservation.class);
		//	.getForObject("http://localhost:8080/FlightReservation/updateReservation"+reservationUpdateRequest, Reservation.class);
		
	
	return reservation;
	}

}
