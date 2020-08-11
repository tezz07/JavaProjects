package com.tezz.FlightReservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tezz.FlightReservation.entity.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {

}
