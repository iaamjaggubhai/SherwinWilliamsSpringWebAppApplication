package com.sherwin.webapp.controllers;

import com.sherwin.webapp.domains.Employee;
import com.sherwin.webapp.services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     *
     * @param employee employee request body
     * @return Employee
     */
    @PostMapping(path = "new-employee")
    public Employee addEmployee(@RequestBody Employee employee){
        log.info("Controller ===> addEmployee {}",employee);
        return employeeService.addEmployee(employee);
    }

    /**
     *
     * @return List<Employee>
     */
    @GetMapping(path = "/employees")
    public List<Employee> getEmployees(){
        log.info("Controller ===> getEmployees");
        return employeeService.getEmployees();
    }

    @GetMapping
    public String message(){
        log.info("Welcome");
        return "Welcome";
    }
}
