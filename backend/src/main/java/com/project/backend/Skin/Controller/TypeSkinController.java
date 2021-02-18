package com.project.backend.Skin.Controller;

import com.project.backend.Skin.Entity.TypeSkin;
import com.project.backend.Skin.Repository.TypeSkinRepository;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class TypeSkinController {

    @Autowired
    private final TypeSkinRepository typeSkinRepository;

    public TypeSkinController(TypeSkinRepository typeSkinRepository) {
        this.typeSkinRepository = typeSkinRepository;
    }

    @GetMapping("/typeSkin")
    public Collection<TypeSkin> TypeSkin() {
        return typeSkinRepository.findAll().stream().collect(Collectors.toList());
    }

}