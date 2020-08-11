package com.tezz.FlightReservation.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.tezz.FlightReservation.entity.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long> {

	 @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture = :dateOfDeparture")	
	 List<Flight> findFlight(@org.springframework.data.repository.query.Param("departureCity")String from,
	  @org.springframework.data.repository.query.Param("arrivalCity")String to,
	  @org.springframework.data.repository.query.Param("dateOfDeparture") Date departureDate);
	 
	 
	
	 @Query("from Flight where id=:id")
	Flight getFlightObjectUsingId(@org.springframework.data.repository.query.Param("id")Long flightid);

	 
	

}