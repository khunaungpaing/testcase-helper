package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// Project Versions entity
@Entity
@Table(name = "project_versions")
@Data
@NoArgsConstructor
public class ProjectVersion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "version_seq")
    @SequenceGenerator(name = "version_seq", sequenceName = "version_id_seq", allocationSize = 1)
    private Long versionId;

    @Column(nullable = false)
    private String versionNumber;

    private LocalDate releaseDate;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;
}
