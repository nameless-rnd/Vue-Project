package com.project.backend.Item.Controller;

import com.project.backend.Item.Entity.Item;
import com.project.backend.Item.Repository.ItemRepository ;

import com.project.backend.Item.Entity.TypeItem;
import com.project.backend.Item.Repository.TypeItemRepository;

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
public class ItemController {
    @Autowired
    private final ItemRepository itemRepository;

    @Autowired
    private TypeItemRepository typeItemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/item")
    public Collection<Item> Item() {
        return itemRepository.findAll().stream().collect(Collectors.toList());
    }


}