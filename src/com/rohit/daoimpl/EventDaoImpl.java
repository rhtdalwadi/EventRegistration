package com.rohit.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rohit.framework.IHibernateDao;
import com.rohit.idao.IEventDao;
import com.rohit.model.Event;

public class EventDaoImpl implements IEventDao{

  @Autowired
  IHibernateDao hibernateDao;
  
  public List<Event> getAllEventsList()
  {
    return hibernateDao.fetchAll(Event.class);
  }
  
  public void insert(Event event){
    hibernateDao.insertEntity(event);
  }

  @Override
  public void update(Event event) {
    hibernateDao.updateEntity(event);
    
  }

  @Override
  public void delete(Event event) {
    hibernateDao.deleteEntity(event);
    
  }

}
