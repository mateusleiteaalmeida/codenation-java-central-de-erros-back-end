package com.centralDeErro.centralDeErros.service.interfaces;

import com.centralDeErro.centralDeErros.entity.Log;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface LogServiceInterface {

    Optional<Log> findById(Long id);

    List<Log> findByLevel(String level);

    List<Log> findByDescription(String description);

    List<Log> findByLog(String log);

    List<Log> findByOrigin(String origin);

    List<Log> findByDate(LocalDateTime date);

}
