package com.yandubina.spring_rest.controller;

import com.yandubina.spring_rest.entity.Employee;
import com.yandubina.spring_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> showAllEmployees() {

        List<Employee> employees = employeeService.showAllEmployees();
        return employees;
    }

    @GetMapping("/employees/{id}")
    public Employee showEmployee(@PathVariable int id) {

        Employee employee = employeeService.showEmployee(id);
        return employee;

    }


    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {

        employeeService.addEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {

        employeeService.addEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {

        Employee employee = employeeService.showEmployee(id);
        employeeService.deleteEmployee(employee);

    }

}
