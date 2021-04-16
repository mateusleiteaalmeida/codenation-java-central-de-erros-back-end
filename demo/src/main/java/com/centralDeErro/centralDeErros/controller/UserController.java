package com.centralDeErro.centralDeErros.controller;

import com.centralDeErro.centralDeErros.entity.Log;
import com.centralDeErro.centralDeErros.entity.User;
import com.centralDeErro.centralDeErros.repository.UserRepository;
import com.centralDeErro.centralDeErros.service.impl.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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
