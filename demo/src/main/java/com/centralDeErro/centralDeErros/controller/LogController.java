package com.centralDeErro.centralDeErros.controller;

import com.centralDeErro.centralDeErros.entity.Log;
import com.centralDeErro.centralDeErros.entity.User;
import com.centralDeErro.centralDeErros.repository.LogRepository;
import com.centralDeErro.centralDeErros.repository.UserRepository;
import com.centralDeErro.centralDeErros.service.impl.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/logs")
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("/logs/{id}")
    public Optional<Log> findById(@PathVariable("id") Long id) {
        return logService.findById(id);
    }

    @GetMapping("/logs/{level}")
    public List<Log> findByLevel(@PathVariable("level") String level) {
        return logService.findByLevel(level);
    }

    @GetMapping("/logs/{description}")
    public List<Log> findByDescription(@PathVariable("description") String description) {
        return logService.findByDescription(description);
    }

    @GetMapping("/logs/{log}")
    public List<Log> findByLog(@PathVariable("log") String log) {
        return logService.findByLog(log);
    }

    @GetMapping("/logs/{origin}")
    public List<Log> findByOrigin(@PathVariable("origin") String origin) {
        return logService.findByOrigin(origin);
    }

    @GetMapping("/logs/{date}")
    public List<Log> findByDate(@PathVariable("date") LocalDateTime date) {
        return logService.findByDate(date);
    }
}
