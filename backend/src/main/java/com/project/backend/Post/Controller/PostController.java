package com.project.backend.Post.Controller;

import com.project.backend.Post.Entity.Post;
import com.project.backend.Post.Repository.PostRepository ;

import com.project.backend.User.Entity.User;
import com.project.backend.User.Repository.UserRepository;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URLDecoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class PostController {
    @Autowired
    private final PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/post")
    public Collection<Post> Post() {
        return postRepository.findAll().stream().collect(Collectors.toList());
    }

    @PostMapping("/post/{informationPost}/{user_id}")
    public Post newPost(Post newPost,
        @PathVariable String informationPost,
        @PathVariable long user_id
    ){
        User user = userRepository.findById(user_id);
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy - HH:mm:ss");
        String dateTime = date.format(format);

        newPost.setInformationPost(informationPost);
        newPost.setCreatedBy(user);
        newPost.setDate(dateTime);

        return postRepository.save(newPost);
    }

}