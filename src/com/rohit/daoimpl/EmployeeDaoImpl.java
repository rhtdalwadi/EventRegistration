package com.rohit.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rohit.framework.ERHibernateDaoSupport;
import com.rohit.idao.IEmployeeDao;
import com.rohit.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl extends ERHibernateDaoSupport implements IEmployeeDao{

  @Override
  public void save(Employee employee) {
    getHibernateTemplate().save(employee);
  }

  @Override
  public void update(Employee employee) {
    getHibernateTemplate().update(employee);
  }

  @Override
  public void delete(Employee employee) {
    getHibernateTemplate().delete(employee);
  }

  @Override
  public Employee findById(String employeeId) {
    String queryString = "from Employee where empId=?";
    List list = getHibernateTemplate().find(queryString, employeeId);
    return (Employee) list.get(0);
  }

  
}
