package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "test_cases")
public class TestCaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_case_seq")
    @SequenceGenerator(name = "test_case_seq", sequenceName = "test_cases_test_case_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "steps", columnDefinition = "TEXT")
    private String steps;

    @Column(name = "expected_results", columnDefinition = "TEXT")
    private String expectedResults;

    @Column(name = "preconditions", columnDefinition = "TEXT")
    private String preconditions;

    @ManyToOne
    @JoinColumn(name = "linked_requirement")
    private RequirementEntity linkedRequirement;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private UserEntity createdBy;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private ProjectEntity project;

    @ManyToOne
    @JoinColumn(name = "reviewer_id")
    private UserEntity reviewer;
}
