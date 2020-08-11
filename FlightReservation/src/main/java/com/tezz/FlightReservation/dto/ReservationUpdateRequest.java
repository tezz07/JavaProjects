package com.tezz.FlightReservation.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReservationUpdateRequest {
 
	private Long id;
	private Boolean checkedIn;
	private int numberOfBags; 
	
}
