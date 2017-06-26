package com.rohit.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rohit.framework.IHibernateDao;

@Repository
public class EmployeeRoleDaoImpl {
  
  @Autowired
  private IHibernateDao hibernateDao;
  
}
