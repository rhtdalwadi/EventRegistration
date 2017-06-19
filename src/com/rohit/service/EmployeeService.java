package com.rohit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.daoimpl.EmployeeDaoImpl;
import com.rohit.idao.IEmployeeDao;
import com.rohit.model.Employee;


@Service
public class EmployeeService {
  @Autowired
  private IEmployeeDao employeeDao;
  
  /*public void save(Employee employee)
  {
    employeeDao.save(employee);
  }*/
  
  public Employee findEmployeeById(String employeeId){
    return employeeDao.findById(employeeId);
  }
}
