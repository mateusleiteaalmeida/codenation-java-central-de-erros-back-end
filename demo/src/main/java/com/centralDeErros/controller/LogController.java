package com.centralDeErros.controller;

import com.centralDeErros.entity.Log;
import com.centralDeErros.service.impl.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping
    public List<Log> findAllLogs() {
        return logService.findAll();
    }

}
