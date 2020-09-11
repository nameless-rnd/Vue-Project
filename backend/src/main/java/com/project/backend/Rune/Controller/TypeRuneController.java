package com.project.backend.Rune.Controller;

import com.project.backend.Rune.Entity.TypeRune;
import com.project.backend.Rune.Repository.TypeRuneRepository ;

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
public class TypeRuneController {

    @Autowired
    private final TypeRuneRepository typeRuneRepository;

    public TypeRuneController(TypeRuneRepository typeRuneRepository) {
        this.typeRuneRepository = typeRuneRepository;
    }

    @GetMapping("/typeRune")
    public Collection<TypeRune> TypeRune() {
        return typeRuneRepository.findAll().stream().collect(Collectors.toList());
    }
}