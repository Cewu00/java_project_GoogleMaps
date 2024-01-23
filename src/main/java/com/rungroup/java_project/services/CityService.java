package com.rungroup.java_project.services;

import com.rungroup.java_project.dto.CityDto;

import java.util.List;

public interface CityService {
    List<CityDto> findAllCities();
}
