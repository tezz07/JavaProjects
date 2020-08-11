package com.tezz.FlightCheckedIn.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Passenger {
	private Long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String phone;
	
}
