package com.project.centralDeErros.controllers;


import com.project.centralDeErros.converter.LogConverter;
import com.project.centralDeErros.dto.LogDto;
import com.project.centralDeErros.entity.Log;
import com.project.centralDeErros.services.impl.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}