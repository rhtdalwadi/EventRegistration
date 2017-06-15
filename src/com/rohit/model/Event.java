package com.rohit.model;

import java.util.Date;

public class Event {
  
  String eventId;
  String eventName;
  Date eventStartTime;
  Date eventEndTime;
  City city;
  String slotNumber;
  
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }
  public Date getEventStartTime() {
    return eventStartTime;
  }
  public void setEventStartTime(Date eventStartTime) {
    this.eventStartTime = eventStartTime;
  }
  public Date getEventEndTime() {
    return eventEndTime;
  }
  public void setEventEndTime(Date eventEndTime) {
    this.eventEndTime = eventEndTime;
  }
  public City getCity() {
    return city;
  }
  public void setCity(City city) {
    this.city = city;
  }
  public String getSlotNumber() {
    return slotNumber;
  }
  public void setSlotNumber(String slotNumber) {
    this.slotNumber = slotNumber;
  }

}
