package com.company.controllers;

import com.company.models.Flight;
import com.company.services.FlightService;

public class FlightController {

    FlightService flightService = FlightService.INSTANCE;

    public void saveFlight() {

        Flight flight = new Flight();
        flightService.saveFlight(flight);
    }
}
