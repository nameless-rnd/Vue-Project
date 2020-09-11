package com.project.backend.Character.Controller;

import com.project.backend.Character.Entity.Skill;
import com.project.backend.Character.Repository.SkillRepository ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class SkillController {

    @Autowired
    private final SkillRepository skillRepository;

    public SkillController(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @GetMapping("/skill")
    public Collection<Skill> Skill() {
        return skillRepository.findAll().stream().collect(Collectors.toList());
    }

}