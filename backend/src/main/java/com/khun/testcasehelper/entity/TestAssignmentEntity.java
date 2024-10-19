package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "test_assignments")
public class TestAssignmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "assignment_seq")
    @SequenceGenerator(name = "assignment_seq", sequenceName = "test_assignments_assignment_id_seq", allocationSize = 1)
    @Column(name = "assignment_id")
    private Long assignmentId;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private UserEntity assignedTo;

    @ManyToOne
    @JoinColumn(name = "environment_id")
    private EnvironmentEntity environment;

    @ManyToOne
    @JoinColumn(name = "version_id")
    private ProjectVersionEntity version;

    @ManyToOne
    @JoinColumn(name = "database_id")
    private DatabaseEntity database;

    @Column(name = "status", length = 50, nullable = false)
    private String status;

    @Column(name = "plan_start_date")
    private LocalDate planStartDate;

    @Column(name = "plan_end_date")
    private LocalDate planEndDate;

    @Column(name = "actual_start_date")
    private LocalDate actualStartDate;

    @Column(name = "actual_end_date")
    private LocalDate actualEndDate;

    @Column(name = "percentage")
    private Integer percentage; // Should be validated between 0 and 100
}
