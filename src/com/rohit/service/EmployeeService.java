package com.rohit.service;

import static com.rohit.util.ERConstants.ROLE_ADMIN;
import static com.rohit.util.ERConstants.ROLE_EMPLOYEE;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
  
  public String getEmployeeRole(String employeeId)
  {
    Employee employee = employeeDao.findById(employeeId);
    String employeeRole = null;
    
    if(employee!=null)
    {
      if(employeeHasRole(employee,ROLE_ADMIN)){
        employeeRole = ROLE_ADMIN ;
      }
      else if(employeeHasRole(employee,ROLE_EMPLOYEE)){
        employeeRole = ROLE_EMPLOYEE ;
      }
      else{
        employeeRole = ROLE_EMPLOYEE ;
      }
    }
    
    return employeeRole;
  }
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
