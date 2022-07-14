package com.example.cv.repository;

import com.example.cv.model.SpecificSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecificSkillRepository extends JpaRepository<SpecificSkill,Long> {
}
