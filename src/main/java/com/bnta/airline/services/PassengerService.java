package com.bnta.airline.services;

import com.bnta.airline.models.Flight;
import com.bnta.airline.models.Passenger;
import com.bnta.airline.models.PassengerDTO;
import com.bnta.airline.repositories.FlightRepository;
import com.bnta.airline.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public Passenger addPassengerToFlight(PassengerDTO passengerDTO, Long id){

        // get passenger or get flight ?? which do I book onto which??
        Passenger passengerToBook = passengerRepository.findById(id).get();
        passengerToBook.setName(passengerDTO.getName());
        passengerToBook.setContactNumber(passengerDTO.getContactNumber());
        passengerToBook.setFlights(new ArrayList<Flight>());

        //loop through list of flight ids and add passenger to flight
        for(Long flightId : passengerDTO.getFlightIds()){
            Flight flight = flightRepository.findById(flightId).get();
            passengerToBook.addFlight(flight);
        }

        // capacity check??

        //saves passenger to flight
        return passengerRepository.save(passengerToBook);
    }
}
