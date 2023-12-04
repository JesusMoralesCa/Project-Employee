package com.fullstack.employeesystemapi.services;

import com.fullstack.employeesystemapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(long id);

    Employee updateEmployee(Long id, Employee employee);
}
