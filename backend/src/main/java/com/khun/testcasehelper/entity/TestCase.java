package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

// Test Cases entity
@Entity
@Table(name = "test_cases")
@Data
@NoArgsConstructor
public class TestCase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_case_seq")
    @SequenceGenerator(name = "test_case_seq", sequenceName = "test_case_id_seq", allocationSize = 1)
    private Long testCaseId;

    @Column(nullable = false)
    private String title;

    private String description;

    private String steps;

    private String expectedResults;

    private String preconditions;

    @ManyToOne
    @JoinColumn(name = "linked_requirement")
    private Requirement linkedRequirement;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "reviewer_id")
    private User reviewer;
}
