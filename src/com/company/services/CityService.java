package com.company.services;

import com.company.models.City;
import com.company.services.impl.CityServiceImpl;

import java.util.List;

public interface CityService {

    CityService INSTANCE = new CityServiceImpl();

    void saveCity(City city);
    List<City> getCitys();
}
