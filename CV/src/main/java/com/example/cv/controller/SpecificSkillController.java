package com.example.cv.controller;

import com.example.cv.model.Skill;
import com.example.cv.model.SpecificSkill;
import com.example.cv.service.SkillService;
import com.example.cv.service.SpecificSkillServices;
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
public class SpecificSkillController {

    private SkillService skillService;
    private SpecificSkillServices specificSkillServices;


    @GetMapping("/addSkill")
    public String getSkill(Model model){
        List<Skill> skills = skillService.getSkills();
        model.addAttribute("skill",skills);
        return "specificSkill/addSpecificSkill";
    }
    @PostMapping("/addSkill")
    public RedirectView addSkill(SpecificSkill specificSkill){
        specificSkillServices.addSpecificSkill(specificSkill);
    return  new RedirectView("/skill");
    }

}
