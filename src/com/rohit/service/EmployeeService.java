package com.rohit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.daoimpl.EmployeeDaoImpl;
import com.rohit.model.Employee;


@Service
public class EmployeeService {
  @Autowired
  EmployeeDaoImpl employeeDao;
  
  public Employee findEmployeeById(String employeeId){
    return employeeDao.findById(employeeId);
  }
}
