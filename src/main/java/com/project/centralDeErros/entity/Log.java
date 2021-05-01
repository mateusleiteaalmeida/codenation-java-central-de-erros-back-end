package com.project.centralDeErros.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

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

    @Column(nullable = false, length = 255)
    private String description;

    @Column(nullable = false, length = 255)
    private String log;

    @Column(nullable = false, length = 255)
    private String origin;

    @CreatedDate
    private LocalDate date;
}
