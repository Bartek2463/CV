package com.example.cv.controller;

import com.example.cv.model.About;
import com.example.cv.model.Skill;
import com.example.cv.service.AboutService;
import com.example.cv.service.SkillService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/skill")
public class SkillsController {

    private SkillService skillService;
    private AboutService aboutService;

    @GetMapping
    public String getSkill(Model model){
        List<About> allAbouts = aboutService.getAllAbouts();
        model.addAttribute("about",allAbouts);
        return "skills/addSkill";
    }
    @PostMapping
    public RedirectView postAddSkill(Skill skill){
        skillService.addSkill(skill);
        return new RedirectView("skills/addSkill");
    }


}
