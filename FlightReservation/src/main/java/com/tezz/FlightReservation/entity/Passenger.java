package com.tezz.FlightReservation.entity;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity(name = "passenger")
public class Passenger extends AbstractEntity {

	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String phone;
	
}
