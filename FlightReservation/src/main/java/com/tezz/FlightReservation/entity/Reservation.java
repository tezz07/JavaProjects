package com.tezz.FlightReservation.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity(name = "reservation")
public class Reservation extends AbstractEntity {

    
	private Boolean checkedIn;
    private int numberOfBags; 
    
    @OneToOne
    private Passenger passenger; 
    @OneToOne
	private Flight flight;
	
	
}
