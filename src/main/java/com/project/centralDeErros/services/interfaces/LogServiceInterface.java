package com.project.centralDeErros.services.interfaces;

import com.project.centralDeErros.dto.LogDto;
import com.project.centralDeErros.entity.Level;
import com.project.centralDeErros.entity.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.Optional;

public interface LogServiceInterface {

    Page<LogDto> findAll(Pageable pageable);

    Optional<Log> findById(Long id);

    Page<LogDto> findByLevel(Level level, Pageable pageable);

    Page<LogDto> findByDescriptionContaining(String description, Pageable pageable);

    Page<LogDto> findByOrigin(String origin, Pageable pageable);

    Page<LogDto> findByDate(LocalDate date, Pageable pageable);

    Log save(Log log);
}
