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

    List<Log> findLogByUserId(Long id);

    Optional<Log> findLogById(Long id);

    List<Log> findLogByLevel(String level);

    List<Log> findLogByDescription(String description);

    List<Log> findLogByLog(String log);

    List<Log> findLogByOrigin(String origin);

    List<Log> findLogByDate(LocalDateTime date);

}
