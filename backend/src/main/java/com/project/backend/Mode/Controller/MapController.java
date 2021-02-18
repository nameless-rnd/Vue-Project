package com.project.backend.Mode.Controller;

import com.project.backend.Mode.Entity.Map;
import com.project.backend.Mode.Repository.MapRepository;

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
public class MapController {

    @Autowired
    private final MapRepository mapRepository;

    public MapController(MapRepository mapRepository) {
        this.mapRepository = mapRepository;
    }

    @GetMapping("/map")
    public Collection<Map> Map() {
        return mapRepository.findAll().stream().collect(Collectors.toList());
    }

}