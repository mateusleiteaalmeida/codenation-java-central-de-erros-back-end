package com.project.centralDeErros.services.interfaces;

import com.project.centralDeErros.entity.Log;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LogServiceInterface {
    List<Log> findAll(Pageable pageable);
}
