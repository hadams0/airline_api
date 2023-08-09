package com.bnta.airline.controllers;

import com.bnta.airline.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("flights")
public class FlightController {

    @Autowired
    FlightService flightService;

//    @GetMapping
//
//    @GetMapping(value = "/{id}")
//
//    @PostMapping
//
//    @DeleteMapping(value = "/{id}")

}
