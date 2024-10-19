package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

// Requirements entity
@Entity
@Table(name = "requirements")
@Data
@NoArgsConstructor
public class Requirement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "requirement_seq")
    @SequenceGenerator(name = "requirement_seq", sequenceName = "requirement_id_seq", allocationSize = 1)
    private Long requirementId;

    @Column(nullable = false)
    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @ManyToOne
    @JoinColumn(name = "version_id")
    private ProjectVersion version;
}
