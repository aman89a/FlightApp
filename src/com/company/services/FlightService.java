package com.company.services;

import com.company.models.Flight;
import com.company.services.impl.FlightServiceImpl;

import java.util.List;

public interface FlightService {

    FlightService INSTANCE = new FlightServiceImpl();

    void saveFlight(Flight flight);
    List<Flight> getFlight();
}

