package com.sherwin.webapp.services;

import com.sherwin.webapp.domains.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     *
     * @param employee employee request body
     * @return Employee
     */
    Employee addEmployee(Employee employee);

    /**
     *
     * @return List<Employee>
     */
    List<Employee> getEmployees();
}
