package com.bnta.airline.models;

import java.util.List;

public class PassengerDTO {

    private String name;

    private int contactNumber;

    private List<Long> flightIds;

    public PassengerDTO(String name, int contactNumber, List flightIds) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.flightIds = flightIds;
    }

    public PassengerDTO(){}

    // Getters & Setters

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

    public List<Long> getFlightIds() {
        return flightIds;
    }

    public void setFlightIds(List<Long> flightIds) {
        this.flightIds = flightIds;
    }
}
