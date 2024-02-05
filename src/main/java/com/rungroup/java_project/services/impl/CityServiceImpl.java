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
    public List<CityDto> findAllCitiesMapData(){
        List<City> cities = cityRepository.findAll();
        return cities.stream().map((city) -> mapToCityDtoMapData(city)).collect(Collectors.toList());

    }

    @Override
    public void delete(Long cityID) {
        cityRepository.deleteById(cityID);
    }

    private CityDto mapToCityDtoMapData(City city) {
        CityDto cityDto = CityDto.builder()
                .id(city.getId())
                .name(city.getName())
                .latitude_x(city.getLatitude_x())
                .longitude_y(city.getLongitude_y())
                .build();
        return cityDto;
    }

    @Override
    public City saveCity(CityDto cityDto) {
        City city = mapToCity(cityDto);
        return cityRepository.save(city);
    }

    @Override
    public CityDto findCityByID(long cityId) {
        City city = cityRepository.findById(cityId).get();
        return mapToCityDto(city);
    }

    @Override
    public void updateCity(CityDto cityDto) {
        City city = mapToCity(cityDto);
        cityRepository.save(city);
    }

    private City mapToCity(CityDto city) {
        City cityDto = City.builder()
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


    private CityDto mapToCityDto(City city){  // we are only mapping the things we need for the DTO, not the whole city database/model
        CityDto cityDto = CityDto.builder()   // in this case we are mapping everything
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
