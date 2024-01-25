package com.rungroup.java_project.repository;

import com.rungroup.java_project.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Long> {
    Optional<City> findByName(String url);
    // findByName is a CUSTOM QUERY METHOD,
    // java sees "findBy" and "Name" and then finds the "Name" property in the <City> model
    // then it just creates the sql code necessary for the extraction of all cities by name.
    // that is how I understood it
}
