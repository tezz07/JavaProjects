package com.tezz.FlightCheckedIn.entity;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Flight {

	private Long id;
	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	@JsonFormat(pattern = "MM-dd-yyyy")	
	private	Date dateOfDeparture;
	private	Date estimatedDepartureTime;	
}
