package com.rohit.idao;

import java.util.List;

import com.rohit.model.Event;

public interface IEventDao {

  public void insert(Event event);
  public void update(Event event);
  public void delete(Event event);
  List<Event> getAllEventsList();
  
  
}
