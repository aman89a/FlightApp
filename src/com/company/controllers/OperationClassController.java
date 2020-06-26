package com.company.controllers;

import com.company.models.OperationClass;
import com.company.services.OperationClassService;

public class OperationClassController {

    OperationClassService operationClassService = OperationClassService.INSTANCE;

    public void saveOperationClass() {

        OperationClass operationClass = new OperationClass();
        operationClassService.saveOperationClass(operationClass);
    }
}
