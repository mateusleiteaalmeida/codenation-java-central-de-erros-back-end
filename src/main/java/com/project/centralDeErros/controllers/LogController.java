package com.project.centralDeErros.controllers;


import com.project.centralDeErros.converter.LogConverter;
import com.project.centralDeErros.dto.LogDto;
import com.project.centralDeErros.entity.Level;
import com.project.centralDeErros.entity.Log;
import com.project.centralDeErros.entity.User;
import com.project.centralDeErros.repository.LogRepository;
import com.project.centralDeErros.services.impl.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    public List<LogDto> findAllLogs(@RequestParam(defaultValue = "0") Integer pageNo,
                                    @RequestParam(defaultValue = "10") Integer pageSize,
                                    @RequestParam(defaultValue = "id") String sortBy) {
        Pageable paging = (PageRequest.of(pageNo, pageSize, Sort.by(sortBy)));
        List<Log> list = logService.findAll(paging);
        return converter.entityToDto(list);
    }

    @GetMapping("/id/{id}")
    public Optional<Log> findById(@PathVariable Long id) {
        return logService.findById(id);
    }

    @GetMapping("/level/{level}")
    public List<LogDto> findByLevel(@PathVariable Level level, Pageable pageable) {
        List<Log> list = logService.findByLevel(level, pageable);
        return converter.entityToDto(list);
    }

    @GetMapping("/description/{description}")
    public List<LogDto> findByDescription(@PathVariable String description, Pageable pageable) {
        List<Log> list = logService.findByDescriptionContaining(description, pageable);
        return converter.entityToDto(list);
    }

    @GetMapping("/origin/{origin}")
    public List<LogDto> findByOrigin(@PathVariable String origin, Pageable pageable) {
        List<Log> list = logService.findByOrigin(origin, pageable);
        return converter.entityToDto(list);
    }

    @GetMapping("/date/{date}")
    public List<LogDto> findByDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date, Pageable pageable) {
        List<Log> list = logService.findByDate(date, pageable);
        return converter.entityToDto(list);
    }

    @PostMapping("/register")
    public Log registerLog (@RequestBody Log log) {
        return logService.save(log);
    }

}