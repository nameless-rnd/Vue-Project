package com.project.backend.Skin.Controller;

import com.project.backend.Skin.Entity.Receive;
import com.project.backend.Skin.Repository.ReceiveRepository;

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
public class ReceiveController {

    @Autowired
    private final ReceiveRepository receiveRepository;

    public ReceiveController(ReceiveRepository receiveRepository) {
        this.receiveRepository = receiveRepository;
    }

    @GetMapping("/receive")
    public Collection<Receive> Receive() {
        return receiveRepository.findAll().stream().collect(Collectors.toList());
    }

}