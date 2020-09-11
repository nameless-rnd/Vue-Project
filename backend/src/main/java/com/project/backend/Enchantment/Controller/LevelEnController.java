package com.project.backend.Enchantment.Controller;

import com.project.backend.Enchantment.Entity.LevelEn;
import com.project.backend.Enchantment.Repository.LevelEnRepository ;

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
public class LevelEnController {

    @Autowired
    private final LevelEnRepository levelEnRepository;

    public LevelEnController(LevelEnRepository levelEnRepository) {
        this.levelEnRepository = levelEnRepository;
    }

    @GetMapping("/levelEn")
    public Collection<LevelEn> LevelEn() {
        return levelEnRepository.findAll().stream().collect(Collectors.toList());
    }

}