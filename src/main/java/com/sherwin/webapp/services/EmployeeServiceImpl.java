package com.sherwin.webapp.services;

import com.sherwin.webapp.domains.Employee;
import com.sherwin.webapp.repositories.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * @param employee employee request body
     * @return Employee
     */
    @Override
    public Employee addEmployee(Employee employee) {
        log.info("ServiceImpl ===> addEmployee {}",employee);
        return employeeRepository.save(employee);
    }

    /**
     * @return List<Employee></Employee>
     */
    @Override
    public List<Employee> getEmployees() {
        log.info("ServiceImpl ===> getEmployees");
        return employeeRepository.findAll();
    }
}
