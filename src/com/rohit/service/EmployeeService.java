package com.rohit.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rohit.daoimpl.EmployeeDaoImpl;
import com.rohit.idao.IEmployeeDao;
import com.rohit.model.Employee;
import com.rohit.model.RolesDefination;

@Transactional
@Service
public class EmployeeService {
  @Autowired
  private IEmployeeDao employeeDao;
  
  /*public void save(Employee employee)
  {
    employeeDao.save(employee);
  }*/
  public void insertEmployee(Employee employee){
    employeeDao.insertEmployee(employee);
  }
  
  public Employee findEmployeeById(String employeeId){
    return employeeDao.findById(employeeId);
  }
  
  public boolean employeeHasRole(Employee employee,String employeeRole) {
    Set<RolesDefination> roles = employee.getRolesDefinations();
    return roles.stream().map(role->role.getRoleId()).anyMatch(role -> role.equals(employeeRole));
  }
}
