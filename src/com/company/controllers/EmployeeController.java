package com.company.controllers;

import com.company.models.Employee;
import com.company.services.EmployeeService;

public class EmployeeController {

    EmployeeService employeeService = EmployeeService.INSTANCE;

    public void saveEmployee() {

        Employee employee = new Employee();
        employeeService.saveEmployee(employee);
    }
}
