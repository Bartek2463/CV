package com.example.cv.controller;

import com.example.cv.model.Education;
import com.example.cv.model.Experience;
import com.example.cv.service.AboutService;
import com.example.cv.service.EducationService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@RequestMapping("/education")
public class EducationController {

    private EducationService educationService;


}
