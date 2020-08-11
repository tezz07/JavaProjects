package com.tezz.FlightReservation.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReservationRequest {

	
	private Long flightId;
	private String passengerfirstName;
	private String passengerlastName;
	private String passengermiddleName;
	private String passengeremail;
	private String passengerphone;
	private String nameOfTheCard;
	private String cardNumber;
	private String ExpairationDate;
	private String securityCode;
	
	
	
}
