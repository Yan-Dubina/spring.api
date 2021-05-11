package com.yandubina.spring_rest.controller;

import com.yandubina.spring_rest.entity.Employee;
import com.yandubina.spring_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/api")
    public List<Employee> showAllEmployees()
    {


        List<Employee> employees= employeeService.showAllEmployees();
        return employees;
    }
}
