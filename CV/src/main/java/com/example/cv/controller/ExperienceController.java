package com.example.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExperienceController {
    @GetMapping("/experience")
    String getExpireance(){
        return "experience/experience";
    }

}
