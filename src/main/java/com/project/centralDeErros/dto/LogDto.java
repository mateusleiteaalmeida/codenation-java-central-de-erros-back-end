package com.project.centralDeErros.dto;


import com.project.centralDeErros.entity.Level;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class LogDto {
    private long id;
    private Level level;
    private String description;
    private String origin;
    private LocalDateTime date;
}
