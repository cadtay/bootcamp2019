package com.manchsterdigital;

import java.util.Optional;

public class Airport {
    public static void main(String[] args) {
        FlightService flightService = new FlightService();

        FlightInformation flight = flightService.retrieveFlight("AB123");
        System.out.println("flight.getAirline().getName() = " + flight.getAirline().get().getName());

        // may have a flight info which could be null
        Optional<FlightInformation> flight1 = Optional.of(flight);

        // value of optional may be null but not too bothered:
        Optional<FlightInformation> flight2 = Optional.ofNullable(flight);

    }
}
