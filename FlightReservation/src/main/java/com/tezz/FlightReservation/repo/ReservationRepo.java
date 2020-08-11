package com.tezz.FlightReservation.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tezz.FlightReservation.entity.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, Long> {
	
	
	//@Query("from Reservation where id =:id")
	Optional<Reservation> findById(@Param("id") Long id);

}
