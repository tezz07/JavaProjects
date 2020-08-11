package com.tezz.FlightCheckedIn.entity;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Reservation {

	private Long id;
	private Boolean checkedIn;
    private int numberOfBags; 
    
    private Passenger passenger; 
	private Flight flight;
	
	
}
