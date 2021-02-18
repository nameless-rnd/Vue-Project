package com.project.backend.Enchantment.Controller;

import com.project.backend.Enchantment.Entity.Enchantment;
import com.project.backend.Enchantment.Repository.EnchantmentRepository ;

import com.project.backend.Enchantment.Entity.TypeEn;
import com.project.backend.Enchantment.Repository.TypeEnRepository;

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
public class EnchantmentController {
    @Autowired
    private final EnchantmentRepository enchantmentRepository;

    @Autowired
    private TypeEnRepository typeEnRepository;

    public EnchantmentController(EnchantmentRepository enchantmentRepository) {
        this.enchantmentRepository = enchantmentRepository;
    }

    @GetMapping("/enchantment")
    public Collection<Enchantment> Enchantment() {
        return enchantmentRepository.findAll().stream().collect(Collectors.toList());
    }

}