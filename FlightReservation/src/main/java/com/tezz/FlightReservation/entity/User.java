package com.tezz.FlightReservation.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name = "user")
public class User extends AbstractEntity {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
}
