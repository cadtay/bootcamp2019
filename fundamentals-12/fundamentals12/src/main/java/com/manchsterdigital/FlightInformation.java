package com.manchsterdigital;

import java.util.Optional;

public class FlightInformation {
    private final String FlightNo;
    private String destination;
    private Optional <Airline> airline;

    public FlightInformation(String FlightNo) {
        this.FlightNo = FlightNo;
    }

    public String getFlightnumber() {
        return FlightNo;
    }

    public String getDestination() {
        return destination;
    }

    public Optional<Airline> getAirline() {
        return airline;
    }

    public void setAirline(Optional<Airline> airline) {
        this.airline = airline;
    }
}
