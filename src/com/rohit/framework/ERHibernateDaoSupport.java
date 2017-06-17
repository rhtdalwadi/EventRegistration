package com.rohit.framework;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class ERHibernateDaoSupport extends HibernateDaoSupport{

  @Autowired
  public void setSessionFactoryBean(SessionFactory sessionFactory)
  {
    setSessionFactory(sessionFactory);
  }
}
