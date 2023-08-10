package com.bnta.airline.components;

import com.bnta.airline.models.Flight;
import com.bnta.airline.repositories.FlightRepository;
import com.bnta.airline.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FlightRepository flightRepository;
    @Autowired
    PassengerRepository passengerRepository;

    public DataLoader(){}

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // create flights

        Flight flight1 = new Flight(
                "Spain",
                30,
                LocalDate.of(2023, 8, 10),
                LocalTime.of(15,0)
        );

        Flight flight2 = new Flight(
                "Tokyo",
                100,
                LocalDate.of(2023, 8, 11),
                LocalTime.of(17,15)
        );

        Flight flight3 = new Flight(
                "New York",
                40,
                LocalDate.of(2023, 8, 12),
                LocalTime.of(13,55)
        );

        Flight flight4 = new Flight(
                "Marbella",
                25,
                LocalDate.of(2023, 8, 13),
                LocalTime.of(20,20)
        );

        Flight flight5 = new Flight(
                "Sweeden",
                70,
                LocalDate.of(2023, 8, 14),
                LocalTime.of(10,0)
        );

        flightRepository.saveAll(Arrays.asList(
                flight1,
                flight2,
                flight3,
                flight4,
                flight5
        ));


        // create passengers

    }
}
