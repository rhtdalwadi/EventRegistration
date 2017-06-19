package com.rohit.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rohit.framework.IHibernateDao;
import com.rohit.idao.IEmployeeDao;
import com.rohit.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements IEmployeeDao{

  @Autowired
  private IHibernateDao hibernateDao;
  
  
  @Override
  public Employee findById(String employeeId) {
    return (Employee) hibernateDao.fetchEntity(Employee.class, employeeId);
    
  }
  
  
  
}
