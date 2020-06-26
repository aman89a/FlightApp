package com.company.controllers;

import com.company.models.Passanger;
import com.company.services.PassangerService;

public class PassangerController {

    PassangerService passangerService = PassangerService.INSTANCE;

    public void savePassanger() {

        Passanger passanger = new Passanger();
        passangerService.savePassanger(passanger);
    }
}
