package com.centralDeErro.centralDeErros.service.impl;

import com.centralDeErro.centralDeErros.entity.Log;
import com.centralDeErro.centralDeErros.repository.LogRepository;
import com.centralDeErro.centralDeErros.service.interfaces.LogServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class LogService implements LogServiceInterface {

    @Autowired
    private LogRepository logRepository;


    @Override
    public Optional<Log> findById(Long id) {
        return logRepository.findById(id);
    }

    @Override
    public List<Log> findByLevel(String level) {
        return logRepository.findByLevel(level);
    }

    @Override
    public List<Log> findByDescription(String description) {
        return logRepository.findByDescription(description);
    }

    @Override
    public List<Log> findByLog(String log) {
        return logRepository.findByLog(log);
    }

    @Override
    public List<Log> findByOrigin(String origin) {
        return logRepository.findByOrigin(origin);
    }

    @Override
    public List<Log> findByDate(LocalDateTime date) {
        return logRepository.findByDate(date);
    }
}
