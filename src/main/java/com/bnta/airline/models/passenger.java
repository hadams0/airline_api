package com.bnta.airline.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "passengers")
public class passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String destination;

    @Column
    private int capacity;

    @Column
    private LocalDate departureDate;

    @Column
    private LocalTime departureTime;


}
