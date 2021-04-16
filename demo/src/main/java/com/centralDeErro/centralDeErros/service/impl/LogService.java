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
    public List<Log> findLogByUserId(Long userId) {
        return logRepository.findLogByUserId(userId);
    }

    @Override
    public Optional<Log> findLogById(Long id) {
        return logRepository.findLogById(id);
    }

    @Override
    public List<Log> findLogByLevel(String level) {
        return logRepository.findLogByLevel(level);
    }

    @Override
    public List<Log> findLogByDescription(String description) {
        return logRepository.findLogByDescription(description);
    }

    @Override
    public List<Log> findLogByLog(String log) {
        return logRepository.findLogByLog(log);
    }

    @Override
    public List<Log> findLogByOrigin(String origin) {
        return logRepository.findLogByOrigin(origin);
    }

    @Override
    public List<Log> findLogByDate(LocalDateTime date) {
        return logRepository.findLogByDate(date);
    }
}
