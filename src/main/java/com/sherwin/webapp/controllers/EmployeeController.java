package com.sherwin.webapp.controllers;

import com.sherwin.webapp.domains.Employee;
import com.sherwin.webapp.services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     *
     * @param employee employee request body
     * @return Employee
     */
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        log.info("Controller ===> addEmployee {}",employee);
        return employeeService.addEmployee(employee);
    }

    /**
     *
     * @return List<Employee>
     */
    @GetMapping
    public List<Employee> getEmployees(){
        log.info("Controller ===> getEmployees");
        return employeeService.getEmployees();
    }

    @GetMapping("welcome")
    public String message(){
        log.info("Welcome");
        return "Welcome";
    }
}
