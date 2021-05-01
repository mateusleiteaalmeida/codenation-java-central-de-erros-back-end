package com.project.centralDeErros.converter;

import com.project.centralDeErros.dto.LogDto;
import com.project.centralDeErros.entity.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;

import java.util.List;
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

    public Page<LogDto> entityToDto(Page<Log> logPage) {
        List<Log> logList = logPage.getContent();
        List<LogDto> logDtoList = logList.stream().map(this::entityToDto).collect(Collectors.toList());
        Page<LogDto> logDtoPage = new PageImpl<>(logDtoList);
        return logDtoPage;
    }

}
