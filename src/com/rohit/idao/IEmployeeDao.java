package com.rohit.idao;

import com.rohit.model.Employee;

public interface IEmployeeDao {

  void save(Employee employee);
  void update(Employee employee);
  void delete(Employee employee);
  Employee findById(String employeeId);
}
