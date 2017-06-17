package com.rohit.idao;

import com.rohit.model.City;

public interface ICityDao {

  void save(City city);
  void update(City city);
  void delete(City city);
  City findByCityName(String cityName);
}
