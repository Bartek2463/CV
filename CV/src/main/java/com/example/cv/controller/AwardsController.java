package com.example.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AwardsController {
    @GetMapping("/awards")
    String getAwards(){
        return "awards/awards";
    }
}
