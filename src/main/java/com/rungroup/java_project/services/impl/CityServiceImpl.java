package com.rungroup.java_project.services.impl;


import com.rungroup.java_project.dto.CityDto;
import com.rungroup.java_project.models.City;
import com.rungroup.java_project.repository.CityRepository;
import com.rungroup.java_project.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityServiceImpl implements CityService {
    private CityRepository citiesRepository;

    @Autowired
    public CityServiceImpl(CityRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }

    @Override
    public List<CityDto> findAllCities() {
        List<City> cities = citiesRepository.findAll();
        return cities.stream().map((city) -> mapToCityDto(city)).collect(Collectors.toList());
    }

    private CityDto mapToCityDto(City city){
        CityDto cityDto = CityDto.builder()
                .id(city.getId())
                .name(city.getName())
                .pinGeoLocation(city.getPinGeoLocation())
                .description(city.getDescription())
                .createdOn(city.getCreatedOn())
                .updatedOn(city.getUpdatedOn())
                .build();

        return cityDto;
    }
}
