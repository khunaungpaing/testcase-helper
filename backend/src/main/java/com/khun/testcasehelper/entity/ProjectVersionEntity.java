package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "project_versions")
public class ProjectVersionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "version_seq")
    @SequenceGenerator(name = "version_seq", sequenceName = "project_versions_version_id_seq", allocationSize = 1)
    @Column(name = "version_id")
    private Long versionId;

    @Column(name = "version_number", length = 50, nullable = false)
    private String versionNumber;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private ProjectEntity project;
}
