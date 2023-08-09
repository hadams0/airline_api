package com.bnta.airline.controllers;

import com.bnta.airline.services.FlightService;
import com.bnta.airline.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("passengers")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @Autowired
    FlightService flightService;

//    @GetMapping
//
//    @GetMapping(value = "/{id}")
//
//    @PostMapping
//
//    @PatchMapping(value = "/{id}")
//
//    @PutMapping(value = "/{id}")



}
