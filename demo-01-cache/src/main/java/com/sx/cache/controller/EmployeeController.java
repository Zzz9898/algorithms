package com.sx.cache.controller;

import com.sx.cache.Service.EmployeeService;
import com.sx.cache.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp/{id}")
    public Employee get(@PathVariable Integer id){
        Employee empById = employeeService.getEmpById(id);
        return empById;
    }
}
