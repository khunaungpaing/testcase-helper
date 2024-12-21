package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "bugs")
public class BugEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bug_seq")
    @SequenceGenerator(name = "bug_seq", sequenceName = "bugs_bug_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "title", length = 255, nullable = false)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "found_by")
    private UserEntity foundBy;

    @ManyToOne
    @JoinColumn(name = "linked_test_case")
    private TestCaseEntity linkedTestCase;

    @ManyToOne
    @JoinColumn(name = "environment_id")
    private EnvironmentEntity environment;

    @ManyToOne
    @JoinColumn(name = "database_id")
    private DatabaseEntity database;

    @ManyToOne
    @JoinColumn(name = "execution_id")
    private TestExecutionRecordEntity execution;

    @Column(name = "status", length = 50, nullable = false)
    private String status;

    @Column(name = "priority", length = 50)
    private String priority;

    @Column(name = "severity", length = 50)
    private String severity;

    @Column(name = "reproducibility", length = 50)
    private String reproducibility;

    @ManyToOne
    @JoinColumn(name = "found_version")
    private ProjectVersionEntity foundVersion;

    @ManyToOne
    @JoinColumn(name = "target_fix_version")
    private ProjectVersionEntity targetFixVersion;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @Column(name = "date_reported", nullable = false)
    private LocalDate dateReported;

    @ManyToOne
    @JoinColumn(name = "handler_id")
    private UserEntity handler;

    @ManyToOne
    @JoinColumn(name = "reviewer_id")
    private UserEntity reviewer;
}
