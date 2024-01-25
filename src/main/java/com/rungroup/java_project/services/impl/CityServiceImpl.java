package com.rungroup.java_project.services.impl;

// Internal Imports
import com.rungroup.java_project.dto.CityDto;
import com.rungroup.java_project.models.City;
import com.rungroup.java_project.repository.CityRepository;
import com.rungroup.java_project.services.CityService;

// Library Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// Implementacija CityService Interfejsa

@Service
public class CityServiceImpl implements CityService {
    private CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository citiesRepository) {
        this.cityRepository = citiesRepository;
    }

    @Override
    public List<CityDto> findAllCities() {
        List<City> cities = cityRepository.findAll();
        return cities.stream().map((city) -> mapToCityDto(city)).collect(Collectors.toList());
    }

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    private CityDto mapToCityDto(City city){  // we are only mapping the things we need for the DTO, not the whole city database/model
        CityDto cityDto = CityDto.builder()
                .id(city.getId())
                .name(city.getName())
                .description(city.getDescription())
                .latitude_x(city.getLatitude_x())
                .longitude_y(city.getLongitude_y())
                .createdOn(city.getCreatedOn())
                .updatedOn(city.getUpdatedOn())
                .build();

        return cityDto;
    }
}
