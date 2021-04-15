package com.centralDeErro.centralDeErros.repository;

import com.centralDeErro.centralDeErros.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {

    Optional<Log> findById(Long id);

    List<Log> findByLevel(String level);

    List<Log> findByDescription(String description);

    List<Log> findByLog(String log);

    List<Log> findByOrigin(String origin);

    List<Log> findByDate(LocalDateTime date);

}
