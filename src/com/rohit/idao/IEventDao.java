package com.rohit.idao;

import com.rohit.model.Event;

public interface IEventDao {

  void save(Event event);
  void update(Event event);
  void delete(Event event);
  
  
}
