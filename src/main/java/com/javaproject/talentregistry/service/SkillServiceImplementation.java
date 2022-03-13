package com.javaproject.talentregistry.service;

import com.javaproject.talentregistry.model.Skill;
import com.javaproject.talentregistry.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SkillServiceImplementation implements SkillService{
    @Autowired
    private SkillRepository skillRepository;

    @Override
    public List<Skill> allSkill() {
        return skillRepository.findAll();
    }

    @Override
    public List<Skill> searchSkill() {
        return null;
    }

    @Override
    public List<String> uniqueSkill() {
        return skillRepository.findUniqueSkill();
    }
}
