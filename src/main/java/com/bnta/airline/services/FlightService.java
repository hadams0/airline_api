package com.bnta.airline.services;

import com.bnta.airline.models.Flight;
import com.bnta.airline.repositories.FlightRepository;
import com.bnta.airline.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;


    // add new flight details


    // display all available flights

    public List<Flight> findAllFlights(){
        return flightRepository.findAll();
    }

    // display details for specific flight
    public Flight findFlight(Long id){ // can add other parameters
        return flightRepository.findById(id).get();//need to add get as it returns an optional
    }

    // cancel a flight


}

