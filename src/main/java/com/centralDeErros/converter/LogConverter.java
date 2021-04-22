package com.centralDeErros.converter;

import com.centralDeErros.DTOs.LogDTO;
import com.centralDeErros.entity.Log;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LogConverter {

    public LogDTO entityToDto(Log log) {
        LogDTO dto = new LogDTO();
        dto.setId(log.getId());
        dto.setLevel(log.getLevel());
        dto.setDescription(log.getDescription());
        dto.setOrigin(log.getOrigin());
        dto.setDate(log.getDate());
        return dto;
    }

    public List<LogDTO> entityToDto(List<Log> log) {
        return log.stream().map(this::entityToDto).collect(Collectors.toList());
    }

    public Log dtoToEntity(LogDTO log) {
        Log entity = new Log();
        entity.setId(entity.getId());
        entity.setLevel(log.getLevel());
        entity.setDescription(log.getDescription());
        entity.setOrigin(log.getOrigin());
        entity.setDate(log.getDate());
        return entity;
    }

    public List<Log> dtoToEntity(List<LogDTO> dto) {
        return dto.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

}
