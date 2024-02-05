package com.rungroup.java_project.services;

import com.rungroup.java_project.dto.CityDto;
import com.rungroup.java_project.models.City;

import java.util.List;

// Used for abstraction and decupling


public interface CityService {
    List<CityDto> findAllCities();
    City saveCity(CityDto cityDto);
    CityDto findCityByID(long cityId);
    void updateCity(CityDto city);
    List<CityDto> findAllCitiesMapData();

    void delete(Long cityID);
}
