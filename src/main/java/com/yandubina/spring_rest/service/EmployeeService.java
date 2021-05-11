package com.yandubina.spring_rest.service;

import com.yandubina.spring_rest.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

   public List<Employee> showAllEmployees();

   public  Employee   showEmployee(int id);

   public  void addEmployee(Employee employee);

   void deleteEmployee(Employee employee);
}
