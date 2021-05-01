package com.project.centralDeErros.services.interfaces;

import com.project.centralDeErros.entity.Level;
import com.project.centralDeErros.entity.Log;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface LogServiceInterface {

    List<Log> findAll(Pageable pageable);

    Optional<Log> findById(Long id, Pageable pageable);

    List<Log> findByLevel(Level level, Pageable pageable);

    List<Log> findByDescriptionContaining(String description, Pageable pageable);

    List<Log> findByOrigin(String origin, Pageable pageable);

    List<Log> findByDate(LocalDate date, Pageable pageable);

    Log save(Log log);
}
