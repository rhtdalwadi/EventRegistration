package com.rohit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.idao.IEmployeeRoleDao;

@Service
public class EmployeeRolesService {
  
  @Autowired
  private IEmployeeRoleDao employeeRolesDao;

}
