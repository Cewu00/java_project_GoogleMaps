package com.rungroup.java_project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUsController {

@GetMapping("/about-us")
public String showAboutUs() {
    return "about_us";
}

}
