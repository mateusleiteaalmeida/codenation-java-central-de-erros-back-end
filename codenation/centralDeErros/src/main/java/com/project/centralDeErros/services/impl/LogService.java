package com.project.centralDeErros.services.impl;

import com.project.centralDeErros.entity.Log;
import com.project.centralDeErros.repository.LogRepository;
import com.project.centralDeErros.services.interfaces.LogServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LogService implements LogServiceInterface {
    @Autowired
    private LogRepository logRepository;

    @Override
    public List<Log> findAll(Pageable pageable) {
        return logRepository.findAll(pageable).getContent();
    }
}
