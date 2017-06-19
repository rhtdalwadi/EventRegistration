package com.rohit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rohit.idao.IEventDao;
import com.rohit.model.Event;

public class EventService {

  @Autowired
  private IEventDao eventDao;
  
  public void addNewEvent(Event event){
    eventDao.insert(event);
  }
  
  public List<Event> getAllEventsList()
  {
    return eventDao.getAllEventsList();
  }
}
