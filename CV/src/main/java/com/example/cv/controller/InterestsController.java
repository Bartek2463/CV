package com.example.cv.controller;

import com.example.cv.model.About;
import com.example.cv.model.Interests;
import com.example.cv.service.AboutService;
import com.example.cv.service.InterestsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
@AllArgsConstructor
@Controller
@RequestMapping("/interests")
public class InterestsController {

    private InterestsService interestsService;
    private AboutService aboutService;

    @GetMapping("/add")
    public String getAddInterests(Model model){
        List<About> allAbouts = aboutService.getAllAbouts();
        model.addAttribute("abouts",allAbouts);
        return "interests/addInterest";
    }
    @GetMapping
    public String getInterests(Model model){
        List<Interests> interest = interestsService.interest();
        model.addAttribute("interest",interest);
        return "interests/interests";
    }

    @PostMapping
    public RedirectView postInterests (Interests interests){
        interestsService.addInterest(interests);
        return new RedirectView("/interests");
    }



}
