package com.project.backend.User.Controller;
import com.project.backend.User.Entity.User;
import com.project.backend.User.Repository.UserRepository ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class UserController {
    @Autowired
    private final UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/{username}/{password}")
    public Collection<User> getUserByUsername(
        @PathVariable("username") String username,
        @PathVariable("password") String password) {
        return userRepository.findUserByUsername(username,password);
    }

    @GetMapping("/user")
    public Collection<User> User() {
        return userRepository.findAll().stream().collect(Collectors.toList());
    }

    @PostMapping("/user/{name}/{username}/{password}/{email}")
    public User newUser(User newUser,
    @PathVariable String name, 
    @PathVariable String username, 
    @PathVariable String password, 
    @PathVariable String email
    ){
            newUser.setName(name);
            newUser.setUsername(username);
            newUser.setPassword(password);
            newUser.setEmail(email);

            return userRepository.save(newUser);
    }
}
