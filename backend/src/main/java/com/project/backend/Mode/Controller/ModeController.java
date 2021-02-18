package com.project.backend.Mode.Controller;

import com.project.backend.Mode.Entity.Mode;
import com.project.backend.Mode.Repository.ModeRepository ;

import com.project.backend.Mode.Entity.TypeMode;
import com.project.backend.Mode.Repository.TypeModeRepository;

import com.project.backend.Mode.Entity.Map;
import com.project.backend.Mode.Repository.MapRepository;

import com.project.backend.Mode.Entity.Rank;
import com.project.backend.Mode.Repository.RankRepository;

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
public class ModeController {
    @Autowired
    private final ModeRepository modeRepository;

    @Autowired
    private TypeModeRepository typeModeRepository;

    @Autowired
    private MapRepository mapRepository;

    @Autowired
    private RankRepository rankRepository;

    public ModeController(ModeRepository modeRepository) {
        this.modeRepository = modeRepository;
    }

    @GetMapping("/mode")
    public Collection<Mode> Mode() {
        return modeRepository.findAll().stream().collect(Collectors.toList());
    }

}