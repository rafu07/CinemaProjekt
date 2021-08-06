package com.rafael.employeeservice.repository;

import com.rafael.employeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {



    Employee findByEmployeeId(Long employeeId);
}

