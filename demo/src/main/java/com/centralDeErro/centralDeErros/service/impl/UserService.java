package com.centralDeErro.centralDeErros.service.impl;

import com.centralDeErro.centralDeErros.entity.User;
import com.centralDeErro.centralDeErros.repository.UserRepository;
import com.centralDeErro.centralDeErros.service.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceInterface, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

//    @Override
//    public <S extends User> S save(S s) {
//        return userRepository.save(s);
//    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
