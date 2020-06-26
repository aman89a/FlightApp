package com.company.controllers;

import com.company.models.City;
import com.company.services.CityService;

public class CityController {

    CityService cityService = CityService.INSTANCE;

    public void saveAccount() {

        City city = new City();
        cityService.saveCity(city);
    }
}
