package com.project.centralDeErros.services.interfaces;

import com.project.centralDeErros.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

    Optional<User> findByEmail(String email);

    List<User> findAll();

    User save(User user);
}
