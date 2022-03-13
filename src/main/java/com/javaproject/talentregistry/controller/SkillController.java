package com.javaproject.talentregistry.controller;

import com.javaproject.talentregistry.model.Skill;
import com.javaproject.talentregistry.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/skill")
public class SkillController {
    @Autowired
    private SkillService skillService;

    /** Method for fetching all skill */
    @GetMapping("/all")
    public List<Skill> all(){
        return skillService.allSkill();
    }

    /** Method for fetching all unique skill */
    @GetMapping("/unique")
    public List<String> unique(){
        return skillService.uniqueSkill();
    }
}
