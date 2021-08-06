package com.rafael.employeeservice.service;


import com.rafael.employeeservice.entity.Employee;
import com.rafael.employeeservice.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
    log.info("inside saveEmployee of EmployeeService ");
     return   employeeRepository.save(employee);
    }


    public Employee findByEmployeeId(Long employeeId) {
      return   employeeRepository.findByEmployeeId(employeeId);
    }
}
