package com.bnta.airline.services;

import com.bnta.airline.models.Passenger;
import com.bnta.airline.repositories.FlightRepository;
import com.bnta.airline.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;


    // add a new passenger
    public void savePassenger(Passenger passenger) {
        passengerRepository.save(passenger);
    }

    // display details of all passengers

    public List<Passenger> displayAllPassengers(){
        return passengerRepository.findAll();
    }

    // display details of a specific passenger
    public Passenger findPassenger(Long id){
        return  passengerRepository.findById(id).get();
    }

    // book passenger onto a flight
    public Passenger addPassengerToFlight(){
        Passenger passenger = new Passenger(
                passenger.getName();

        )
    }
}
