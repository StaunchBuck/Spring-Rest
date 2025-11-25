package com.tech.spring.rest.restfulwebservice.jackson.service;

import com.tech.spring.rest.restfulwebservice.jackson.entity.oneTone.Employee;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);
}
