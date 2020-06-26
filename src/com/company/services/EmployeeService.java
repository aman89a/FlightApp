package com.company.services;

import com.company.models.Employee;
import com.company.services.impl.EmployeeServiceImpl;

import java.util.List;

public interface EmployeeService {

    EmployeeService INSTANCE = new EmployeeServiceImpl();

    void saveEmployee(Employee employee);
    List<Employee> getEmployees();
}
