package com.project.centralDeErros.converter;

import com.project.centralDeErros.dto.LogDto;
import com.project.centralDeErros.entity.Log;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class LogConverter {

    public LogDto entityToDto(Log log) {
        LogDto dto = new LogDto();
        dto.setId(log.getId());
        dto.setLevel(log.getLevel());
        dto.setDescription(log.getDescription());
        dto.setOrigin(log.getOrigin());
        dto.setDate(log.getDate());
        return dto;
    }

    public List<LogDto> entityToDto(List<Log> log) {
        return log.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public Log dtoToEntity(LogDto log) {
        Log entity = new Log();
        entity.setId(entity.getId());
        entity.setLevel(log.getLevel());
        entity.setDescription(log.getDescription());
        entity.setOrigin(log.getOrigin());
        entity.setDate(log.getDate());
        return entity;
    }

    public List<Log> dtoToEntity(List<LogDto> dto) {
        return dto.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }
}
