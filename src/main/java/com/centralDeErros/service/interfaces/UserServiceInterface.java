package com.centralDeErros.service.interfaces;


import com.centralDeErros.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {

    Optional<User> findByEmail(String email);

    List<User> findAll();
}
