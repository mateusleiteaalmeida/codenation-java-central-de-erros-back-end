package com.centralDeErros.controller;

import com.centralDeErros.entity.User;
import com.centralDeErros.repository.UserRepository;
import com.centralDeErros.service.impl.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{email}")
    public Optional<User> findUserByEmail(@PathVariable("email") String email) { return userService.findByEmail(email); };

    @PostMapping("/register")
    public User registerUser (@RequestBody User user) {
        User userRegistered = userRepository.save(user);
        return userRepository.save(userRegistered);
    }

}
