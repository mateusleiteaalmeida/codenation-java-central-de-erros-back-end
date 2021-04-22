package com.centralDeErros.service.impl;

import com.centralDeErros.entity.Log;
import com.centralDeErros.repository.LogRepository;
import com.centralDeErros.service.interfaces.LogServiceInterface;
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
