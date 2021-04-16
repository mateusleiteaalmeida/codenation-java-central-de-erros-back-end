package com.centralDeErro.centralDeErros.service.interfaces;

import com.centralDeErro.centralDeErros.entity.Log;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface LogServiceInterface {

    List<Log> findLogByUserId(Long userId);

    Optional<Log> findLogById(Long id);

    List<Log> findLogByLevel(String level);

    List<Log> findLogByDescription(String description);

    List<Log> findLogByLog(String log);

    List<Log> findLogByOrigin(String origin);

    List<Log> findLogByDate(LocalDateTime date);

}
