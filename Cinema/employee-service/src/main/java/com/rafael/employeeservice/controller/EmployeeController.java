package com.rafael.employeeservice.controller;


import com.rafael.employeeservice.entity.Employee;
import com.rafael.employeeservice.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

@Autowired
private EmployeeService employeeService;

@PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
    log.info("inside saveEmployee of emplyeeService");
  return   employeeService.saveEmployee(employee);
}

@RequestMapping("/{id}")

    public Employee findByEmployeeId(@PathVariable("id") Long employeeId){
   return employeeService.findByEmployeeId(employeeId);
}



}
