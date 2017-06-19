package com.rohit.framework.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rohit.framework.IHibernateDao;

@Repository
@Transactional
public class HibernateDaoImpl extends HibernateDaoSupport implements IHibernateDao {

  protected final Log logger = LogFactory.getLog(getClass());

  @Autowired
  public void init(SessionFactory factory) {
    setSessionFactory(factory);
  }

  public Object fetchEntity(final Class entityClass, final Serializable id) {
    if (logger.isDebugEnabled())
      logger.debug("get entity: " + entityClass + " id=" + id);
    Object data = getHibernateTemplate().execute(new HibernateCallback<Object>() {
      public Object doInHibernate(Session session) throws HibernateException {
        session.setFlushMode(FlushMode.COMMIT);
        return session.get(entityClass, id);
      }
    });

    return data;
  }

  public void insertEntity(final Object entity) {
    if (logger.isDebugEnabled())
      logger.debug("saving entity: " + entity);

    HibernateTemplate ht = getHibernateTemplate();
    ht.persist(entity);
    ht.flush();
  }

  public Serializable insertEntityAndGetId(final Object entity) {
    if (logger.isDebugEnabled())
      logger.debug("saving entity: " + entity);

    HibernateTemplate ht = getHibernateTemplate();
    Serializable id = ht.save(entity);
    ht.flush();
    return id;
  }

  public void updateEntity(final Object entity) {
    if (logger.isDebugEnabled())
      logger.debug("updating entity: " + entity);

    HibernateTemplate ht = getHibernateTemplate();
    ht.update(entity);
    ht.flush();
  }

  public void deleteEntity(Object entity) {
    if (logger.isDebugEnabled())
      logger.debug("delete entity: " + entity);

    HibernateTemplate ht = getHibernateTemplate();
    ht.delete(entity);
    ht.flush();
  }

  public void deleteEntityById(final Class entityClass, Serializable id) {
    if (logger.isDebugEnabled())
      logger.debug("delete entity: " + entityClass);

    Object entity = fetchEntity(entityClass, id);
    deleteEntity(entity);;
  }

  public List fetchAll(final Object entityClass) {
    if (logger.isDebugEnabled())
      logger.debug("get entity: " + entityClass);
    List data = (List) getHibernateTemplate().execute(new HibernateCallback<Object>() {
      public Object doInHibernate(Session session) throws HibernateException {
        session.setFlushMode(FlushMode.COMMIT);
        return session.createCriteria((Class) entityClass).list();
      }
    });

    return data;
  }



}
