package com.project.centralDeErros.repository;

import com.project.centralDeErros.entity.Level;
import com.project.centralDeErros.entity.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

public interface LogRepository extends JpaRepository<Log, Long> {

    Page<Log> findAll(Pageable pageable);

    Optional<Log> findById(Long id, Pageable pageable);

    Page<Log> findByLevel(Level level, Pageable pageable);

    Page<Log> findByDescriptionContaining(String description, Pageable pageable);

    Page<Log> findByOrigin(String origin, Pageable pageable);

    Page<Log> findByDate(LocalDate date, Pageable pageable);

}
