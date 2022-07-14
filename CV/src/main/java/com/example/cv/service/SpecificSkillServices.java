package com.example.cv.service;

import com.example.cv.model.SpecificSkill;
import com.example.cv.repository.SpecificSkillRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SpecificSkillServices {
    private SpecificSkillRepository specificSkillRepository;


    public void addSpecificSkill(SpecificSkill specificSkill) {
        specificSkillRepository.save(specificSkill);
    }

    public List<SpecificSkill> getSpecificSkills() {
        return specificSkillRepository.findAll();
    }

    public SpecificSkill getSpecificSkillById(Long id) {
        return specificSkillRepository.findById(id).orElseThrow();
    }

    public void editSpecificSkill(SpecificSkill specificSkill) {
        specificSkillRepository.save(specificSkill);
    }

    public void deleteSpecificSkill(Long id){
        specificSkillRepository.deleteById(id);
    }
}
