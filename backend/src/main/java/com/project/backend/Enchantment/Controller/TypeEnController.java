package com.project.backend.Enchantment.Controller;

import com.project.backend.Enchantment.Entity.TypeEn;
import com.project.backend.Enchantment.Repository.TypeEnRepository ;

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
public class TypeEnController {

    @Autowired
    private final TypeEnRepository typeEnRepository;

    public TypeEnController(TypeEnRepository typeEnRepository) {
        this.typeEnRepository = typeEnRepository;
    }

    @GetMapping("/typeEn")
    public Collection<TypeEn> TypeEn() {
        return typeEnRepository.findAll().stream().collect(Collectors.toList());
    }
}