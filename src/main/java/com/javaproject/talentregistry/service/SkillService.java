package com.javaproject.talentregistry.service;

import com.javaproject.talentregistry.model.Skill;

import java.util.List;

public interface SkillService {
    public List<Skill> allSkill();

    public List<Skill> searchSkill();

    public List<String> uniqueSkill();
}
