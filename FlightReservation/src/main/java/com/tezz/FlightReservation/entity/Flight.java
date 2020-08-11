package com.tezz.FlightReservation.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Flight extends AbstractEntity {

	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	@JsonFormat(pattern = "MM-dd-yyyy")
	@Temporal(TemporalType.DATE)
	private	Date dateOfDeparture;
	@Temporal(TemporalType.TIMESTAMP)
	private	Date estimatedDepartureTime;	
}
