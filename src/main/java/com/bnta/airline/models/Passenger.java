package com.bnta.airline.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "contact_number")
    private int contactNumber;

    @JsonIgnoreProperties({"passengers"})
    @ManyToMany
    @JoinTable(
            name = "passengers_flights",
            joinColumns = @JoinColumn(name = "passenger_id"),
            inverseJoinColumns = @JoinColumn(name = "flight_id")
    )
    private List<Flight> flights;

    public Passenger (String name, int contactNumber){
        this.name = name;
        this.contactNumber = contactNumber;
        this.flights = new ArrayList<>();
    }

    public Passenger() {}

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public void removeFlight(Flight flight){
        this.flights.remove(flight);
    }

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
