package com.company.services;

import com.company.models.Flight;
import com.company.models.Passanger;
import com.company.services.impl.FlightServiceImpl;
import com.company.services.impl.PassangerServiceImpl;

import java.util.List;

public interface PassangerService {

    PassangerService INSTANCE = new PassangerServiceImpl();

    void savePassanger(Passanger passanger);
    List<Passanger> getPassanger();
}
