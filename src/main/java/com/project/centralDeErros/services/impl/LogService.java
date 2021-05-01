package com.project.centralDeErros.services.impl;

import com.project.centralDeErros.converter.LogConverter;
import com.project.centralDeErros.dto.LogDto;
import com.project.centralDeErros.entity.Level;
import com.project.centralDeErros.entity.Log;
import com.project.centralDeErros.repository.LogRepository;
import com.project.centralDeErros.services.interfaces.LogServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class LogService implements LogServiceInterface {

    @Autowired
    private LogRepository logRepository;

    @Autowired
    LogConverter converter;

    @Override
    public Page<LogDto> findAll(Pageable pageable) {
        Page<Log> page = logRepository.findAll(pageable);
        return converter.entityToDto(page);
    }

    @Override
    public Optional<Log> findById(Long id) {
        return logRepository.findById(id);
    }

    @Override
    public Page<LogDto> findByLevel(Level level, Pageable pageable) {
        Page<Log> page = logRepository.findByLevel(level, pageable);
        return converter.entityToDto(page);
    }

    @Override
    public Page<LogDto> findByDescriptionContaining(String description, Pageable pageable) {
        Page<Log> page =logRepository.findByDescriptionContaining(description, pageable);
        return converter.entityToDto(page);
    }

    @Override
    public Page<LogDto> findByOrigin(String origin, Pageable pageable) {
        Page<Log> page = logRepository.findByOrigin(origin, pageable);
        return converter.entityToDto(page);
    }

    @Override
    public Page<LogDto> findByDate(LocalDate date, Pageable pageable) {
        Page<Log> page = logRepository.findByDate(date, pageable);
        return converter.entityToDto(page);
    }

    @Override
    public Log save(Log log) {
        return logRepository.save(log);
    }

}
