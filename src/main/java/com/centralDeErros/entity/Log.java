package com.centralDeErros.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "logs")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private Level level;

    @Column
    @NotNull
    @Size(max = 255)
    private String description;

    @Column
    @NotNull
    @Size(max = 255)
    private String log;

    @Column
    @NotNull
    @Size(max = 255)
    private String origin;

    @CreatedDate
    private LocalDateTime date;

}
