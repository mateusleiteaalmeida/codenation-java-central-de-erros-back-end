package com.project.centralDeErros.controllers;

import com.project.centralDeErros.controllers.exceptions.ResourceNotFoundException;
import com.project.centralDeErros.dto.LogDto;
import com.project.centralDeErros.entity.User;
import com.project.centralDeErros.repository.UserRepository;
import com.project.centralDeErros.services.impl.LogService;
import com.project.centralDeErros.services.impl.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    private LogService logService;


    @GetMapping
    @ApiOperation("Lista todos os usuários")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Usuários retornados com sucesso")})
    public List<User> findAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/email/{email}")
    @ApiOperation("Valida se o usuário existe")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Usuários retornados com sucesso")})
    public Optional<User> findUserByEmail(@PathVariable("email") String email) {
        try {
            return userService.findByEmail(email);
        } catch (Exception e) {
            throw new ResourceNotFoundException("usuário");
        }
    }

    @PostMapping("/register")
    @ApiOperation("Cria um novo usuário")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Usuário criado com sucesso")})
    public User registerUser (@RequestBody User user) {
        return userService.save(user);
    }

    @PostMapping("/login")
    @ApiOperation("Login do usuario")
    @ApiResponses(value = {@ApiResponse(code = 401, message = "Usuario não cadastrado")})
    public Page<LogDto> login (String userEmail, String senha, Pageable pageable) {
            Optional<User> user = userService.findByEmail(userEmail);
           String userBanco = user.get().getPassword();
        if(!userEmail.isEmpty() && senha.equals(userBanco)){
          return logService.findAll(pageable);
//            return "autorizado";
        }
        throw new Error();
    }

}
