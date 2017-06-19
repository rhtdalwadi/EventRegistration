package com.rohit.framework;

import java.io.Serializable;
import java.util.List;

public interface IHibernateDao {
  
  public Object fetchEntity(Class entityClass, Serializable id);
  
  public void insertEntity(final Object entity);
  
  public Serializable insertEntityAndGetId(final Object entity);
  
  public void updateEntity(final Object entity);
  
  public void deleteEntity(Object entity);
  
  public void deleteEntityById(final Class entityClass, Serializable id);
  
  public List fetchAll(final Object entityClass);
}
