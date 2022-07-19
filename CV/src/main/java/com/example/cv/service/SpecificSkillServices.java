package com.example.cv.service;

import com.example.cv.model.SpecificSkill;
import com.example.cv.repository.SpecificSkillRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SpecificSkillServices {
    private SpecificSkillRepository specificSkillRepository;
    private SkillService skillService;


    public void addSpecificSkill(SpecificSkill specificSkill) {
        specificSkillRepository.save(specificSkill);
    }

    public List<SpecificSkill> getSpecificSkills(SkillService skillService,Long id) {
        return specificSkillRepository.findAll().stream()
                .filter(v->v.getId().equals(skillService.getSkillById(id)))
                .collect(Collectors.toList());
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
