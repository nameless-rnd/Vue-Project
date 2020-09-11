package com.project.backend.Character.Controller;

import com.project.backend.Character.Entity.TypeHeroes;
import com.project.backend.Character.Repository.TypeHeroesRepository ;

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
public class TypeHeroesController {

    @Autowired
    private final TypeHeroesRepository typeHeroesRepository;

    public TypeHeroesController(TypeHeroesRepository typeHeroesRepository) {
        this.typeHeroesRepository = typeHeroesRepository;
    }

    @GetMapping("/typeHeroes")
    public Collection<TypeHeroes> TypeHeroes() {
        return typeHeroesRepository.findAll().stream().collect(Collectors.toList());
    }
}