package com.project.backend.Rune.Controller;

import com.project.backend.Rune.Entity.Level;
import com.project.backend.Rune.Repository.LevelRepository ;

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
public class LevelController {

    @Autowired
    private final LevelRepository levelRepository;

    public LevelController(LevelRepository levelRepository) {
        this.levelRepository = levelRepository;
    }

    @GetMapping("/level")
    public Collection<Level> Level() {
        return levelRepository.findAll().stream().collect(Collectors.toList());
    }

}