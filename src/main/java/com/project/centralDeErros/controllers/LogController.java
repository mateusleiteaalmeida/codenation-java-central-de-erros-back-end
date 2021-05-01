package com.project.centralDeErros.controllers;


import com.project.centralDeErros.converter.LogConverter;
import com.project.centralDeErros.dto.LogDto;
import com.project.centralDeErros.entity.Level;
import com.project.centralDeErros.entity.Log;
import com.project.centralDeErros.entity.User;
import com.project.centralDeErros.repository.LogRepository;
import com.project.centralDeErros.services.impl.LogService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/logs")
public class LogController {

    @Autowired
    private LogService logService;

    @Autowired
    LogConverter converter;

    @GetMapping
    @ApiOperation("Lista todos os logs de erros")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Logs retornados com sucesso")})
    public List<LogDto> findAllLogs(@RequestParam(defaultValue = "0") Integer pageNo,
                                    @RequestParam(defaultValue = "10") Integer pageSize,
                                    @RequestParam(defaultValue = "id") String sortBy) {
        Pageable paging = (PageRequest.of(pageNo, pageSize, Sort.by(sortBy)));
        List<Log> list = logService.findAll(paging);
        return converter.entityToDto(list);
    }

    @GetMapping("/id/{id}")
    @ApiOperation("Lista o log de erro pelo id")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "Log não encontrado"),
            @ApiResponse(code = 200, message = "Log retornado com sucesso")})
    public Optional<Log> findById(@PathVariable Long id) {
        return logService.findById(id);
    }

    @GetMapping("/level/{level}")
    @ApiOperation("Lista os logs de erros pelo level")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "Logs não encontrados"),
            @ApiResponse(code = 200, message = "Logs retornados com sucesso")})
    public List<LogDto> findByLevel(@PathVariable Level level, Pageable pageable) {
        List<Log> list = logService.findByLevel(level, pageable);
        return converter.entityToDto(list);
    }

    @GetMapping("/description/{description}")
    @ApiOperation("Lista os logs de erros pela descrição")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "Logs não encontrados"),
            @ApiResponse(code = 200, message = "Logs retornados com sucesso")})
    public List<LogDto> findByDescription(@PathVariable String description, Pageable pageable) {
        List<Log> list = logService.findByDescriptionContaining(description, pageable);
        return converter.entityToDto(list);
    }

    @GetMapping("/origin/{origin}")
    @ApiOperation("Lista os logs de erros pela origem")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "Logs não encontrados"),
            @ApiResponse(code = 200, message = "Logs retornados com sucesso")})
    public List<LogDto> findByOrigin(@PathVariable String origin, Pageable pageable) {
        List<Log> list = logService.findByOrigin(origin, pageable);
        return converter.entityToDto(list);
    }

    @GetMapping("/date/{date}")
    @ApiOperation("Lista os logs de erros pela data")
    @ApiResponses(value = {@ApiResponse(code = 404, message = "Logs não encontrados"),
            @ApiResponse(code = 200, message = "Logs retornados com sucesso")})
    public List<LogDto> findByDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date, Pageable pageable) {
        List<Log> list = logService.findByDate(date, pageable);
        return converter.entityToDto(list);
    }

    @PostMapping("/register")
    @ApiOperation("Cria um novo log")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Log criado com sucesso")})
    public Log registerLog (@RequestBody Log log) {
        return logService.save(log);
    }

}