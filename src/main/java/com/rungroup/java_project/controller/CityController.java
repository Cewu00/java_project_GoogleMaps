package com.rungroup.java_project.controller;

import com.rungroup.java_project.dto.CityDto;
import com.rungroup.java_project.models.City;
import com.rungroup.java_project.services.CityService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("/cities/new")
    public String createCityForm(Model model) {
        City city = new City();
        model.addAttribute("city", city);

        return "cities-create";

    }
    @PostMapping("/cities/new")
    public String saveCity(@ModelAttribute("city") City city) {
        cityService.saveCity(city);
        return "redirect:/cities";
    }

    @GetMapping("/cities/{cityID}/edit")
    public String editCityForm(@PathVariable("cityID") long cityID, Model model){
        CityDto city = cityService.findCityByID(cityID);
        model.addAttribute("city", city);
        return "cities-edit";
    }

    @PostMapping("/cities/{cityId}/edit")
    public String updateCity(@PathVariable("cityId") Long cityId,
                             @Valid @ModelAttribute("city") CityDto city,
                             BindingResult result) {
        if(result.hasErrors()){
            return "cities-edit";
        }
        city.setId(cityId);
        cityService.updateCity(city);
        return "redirect:/cities";
    }

}
