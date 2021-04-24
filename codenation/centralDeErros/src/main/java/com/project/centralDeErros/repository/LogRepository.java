package com.project.centralDeErros.repository;

import com.project.centralDeErros.entity.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
    Page<Log> findAll(Pageable pageable);
}
