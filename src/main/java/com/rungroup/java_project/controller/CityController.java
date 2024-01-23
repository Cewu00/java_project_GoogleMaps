package com.rungroup.java_project.controller;

import com.rungroup.java_project.dto.CityDto;
import com.rungroup.java_project.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CityController {
    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public String listCities(Model model) {
        List<CityDto> cities = cityService.findAllCities();
        model.addAttribute("cities", cities);
        return "cities-list";
    }
}
