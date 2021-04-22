package com.centralDeErros.service.interfaces;

import com.centralDeErros.entity.Log;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface LogServiceInterface {

    List<Log> findAll(Pageable pageable);

}
