package com.centralDeErro.centralDeErros.controller;

import com.centralDeErro.centralDeErros.entity.User;
import com.centralDeErro.centralDeErros.repository.UserRepository;
import com.centralDeErro.centralDeErros.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAllUsers() {
        return userService.findAll();
    }

}
