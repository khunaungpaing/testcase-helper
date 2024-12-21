package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "environments")
public class EnvironmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "environment_seq")
    @SequenceGenerator(name = "environment_seq", sequenceName = "environments_environment_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
}
