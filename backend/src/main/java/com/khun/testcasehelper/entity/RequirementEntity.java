package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "requirements")
public class RequirementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "requirement_seq")
    @SequenceGenerator(name = "requirement_seq", sequenceName = "requirements_requirement_id_seq", allocationSize = 1)
    @Column(name = "requirement_id")
    private Long requirementId;

    @Column(name = "title", length = 255, nullable = false)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private UserEntity createdBy;

    @ManyToOne
    @JoinColumn(name = "version_id")
    private ProjectVersionEntity version;
}
