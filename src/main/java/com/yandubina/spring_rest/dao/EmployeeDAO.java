package com.yandubina.spring_rest.dao;


import com.yandubina.spring_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();
}
