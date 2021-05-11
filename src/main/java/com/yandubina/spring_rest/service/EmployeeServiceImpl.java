package com.yandubina.spring_rest.service;

import com.yandubina.spring_rest.dao.EmployeeDAO;
import com.yandubina.spring_rest.dao.EmployeeDOAImpl;
import com.yandubina.spring_rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<Employee> showAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee showEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }
}
