package com.project.backend.Rune.Controller;

import com.project.backend.Rune.Entity.Rune;
import com.project.backend.Rune.Repository.RuneRepository ;

import com.project.backend.Rune.Entity.TypeRune;
import com.project.backend.Rune.Repository.TypeRuneRepository;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class RuneController {
    @Autowired
    private final RuneRepository runeRepository;

    @Autowired
    private TypeRuneRepository typeRuneRepository;

    public RuneController(RuneRepository runeRepository) {
        this.runeRepository = runeRepository;
    }

    @GetMapping("/rune")
    public Collection<Rune> Rune() {
        return runeRepository.findAll().stream().collect(Collectors.toList());
    }


}
