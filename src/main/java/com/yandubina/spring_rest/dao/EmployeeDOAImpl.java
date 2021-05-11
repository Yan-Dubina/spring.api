package com.yandubina.spring_rest.dao;

import com.yandubina.spring_rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDOAImpl implements  EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory ;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {

        Session session = sessionFactory.getCurrentSession();
        List<Employee> employees = session.createQuery("from Employee" , Employee.class).getResultList();

        return employees;
    }
}
