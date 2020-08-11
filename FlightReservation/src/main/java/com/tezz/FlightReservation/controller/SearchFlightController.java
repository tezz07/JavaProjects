package com.tezz.FlightReservation.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tezz.FlightReservation.Services.FlightRepoServices;
import com.tezz.FlightReservation.entity.Flight;

@RestController
@CrossOrigin
public class SearchFlightController {

	@Autowired
	private FlightRepoServices flightRepoServices;

	@PostMapping("saveFlight")
	public Flight saveFlight(@RequestBody Flight flight) {

		return flightRepoServices.SaveFlights(flight);

	}

	@GetMapping("/searchFlight/{from}/{to}/{date}")
	public List<Flight> FindFlight(@PathVariable("from") String from, @PathVariable("to") String to,
			@PathVariable("date")  @DateTimeFormat(pattern="yyyy-MM-dd") Date departureDate)
	{
		return flightRepoServices.findFlight(from, to, departureDate);

	}
	
	
	
	
	
	
	
}
