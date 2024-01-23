package com.rungroup.java_project.repository;

import com.rungroup.java_project.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Long> {
    Optional<City> findByName(String url);

}
