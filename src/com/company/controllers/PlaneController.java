package com.company.controllers;

import com.company.models.Plane;
import com.company.services.PlaneService;

public class PlaneController {

    PlaneService planeService = PlaneService.INSTANCE;

    public void savePlane(){

        Plane plane = new Plane();
        planeService.savePlane(plane);
    }
}
