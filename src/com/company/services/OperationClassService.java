package com.company.services;

import com.company.models.OperationClass;
import com.company.services.impl.OperationClassServiceImpl;

import java.util.List;

public interface OperationClassService {

    OperationClassService INSTANCE = new OperationClassServiceImpl();

    void saveOperationClass(OperationClass operationClass);
    List<OperationClass> getOperationClass();
}
