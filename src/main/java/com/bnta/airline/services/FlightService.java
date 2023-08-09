package com.bnta.airline.services;

import com.bnta.airline.models.Flight;
import com.bnta.airline.models.FlightDTO;
import com.bnta.airline.repositories.FlightRepository;
import com.bnta.airline.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;


    // add new flight details
    public Flight addFlight(FlightDTO flightDTO){
        Flight flight = new Flight(
                flightDTO.getDestination(),
                flightDTO.getCapacity(),
                flightDTO.getDepartureDate(),
                flightDTO.getDepartureTime()
        );
        return flightRepository.save(flight);
    }

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

