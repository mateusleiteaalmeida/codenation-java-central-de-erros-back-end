package com.project.centralDeErros.services.impl;

import com.project.centralDeErros.entity.Level;
import com.project.centralDeErros.entity.Log;
import com.project.centralDeErros.repository.LogRepository;
import com.project.centralDeErros.services.interfaces.LogServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class LogService implements LogServiceInterface {

    @Autowired
    private LogRepository logRepository;

    @Override
    public List<Log> findAll(Pageable pageable) {
        return logRepository.findAll(pageable).getContent();
    }

    @Override
    public Optional<Log> findById(Long id, Pageable pageable) {
        return logRepository.findById(id, pageable);
    }

    @Override
    public List<Log> findByLevel(Level level, Pageable pageable) {
        return logRepository.findByLevel(level, pageable).getContent();
    }

    @Override
    public List<Log> findByDescriptionContaining(String description, Pageable pageable) {
        return logRepository.findByDescriptionContaining(description, pageable).getContent();
    }

    @Override
    public List<Log> findByOrigin(String origin, Pageable pageable) {
        return logRepository.findByOrigin(origin, pageable).getContent();
    }

    @Override
    public List<Log> findByDate(LocalDate date, Pageable pageable) {
        return logRepository.findByDate(date, pageable).getContent();
    }

    @Override
    public Log save(Log log) {
        return logRepository.save(log);
    }

}
