package com.centralDeErros.DTOs;

import com.centralDeErros.entity.Level;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class LogDTO {

    private long id;
    private Level level;
    private String description;
    private String origin;
    private LocalDateTime date;

}
