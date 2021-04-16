package com.centralDeErro.centralDeErros.controller;

import com.centralDeErro.centralDeErros.entity.Log;
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

    @GetMapping("/{userId}")
    public List<Log> findLogByUserId(@PathVariable("userId") Long userId) {
        return logService.findLogByUserId(userId);
    }

    @GetMapping("/{id}")
    public Optional<Log> findLogById(@PathVariable("id") Long id) {
        return logService.findLogById(id);
    }

    @GetMapping("/{level}")
    public List<Log> findLogByLevel(@PathVariable("level") String level) {
        return logService.findLogByLevel(level);
    }

    @GetMapping("/{description}")
    public List<Log> findLogByDescription(@PathVariable("description") String description) {
        return logService.findLogByDescription(description);
    }

    @GetMapping("/{log}")
    public List<Log> findLogByLog(@PathVariable("log") String log) {
        return logService.findLogByLog(log);
    }

    @GetMapping("/{origin}")
    public List<Log> findLogByOrigin(@PathVariable("origin") String origin) {
        return logService.findLogByOrigin(origin);
    }

    @GetMapping("/{date}")
    public List<Log> findLogByDate(@PathVariable("date") LocalDateTime date) {
        return logService.findLogByDate(date);
    }
}
