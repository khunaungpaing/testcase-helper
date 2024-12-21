package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "test_execution_records")
public class TestExecutionRecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "execution_record_seq")
    @SequenceGenerator(name = "execution_record_seq", sequenceName = "test_execution_records_execution_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "assignment_id")
    private TestAssignmentEntity assignment;

    @ManyToOne
    @JoinColumn(name = "test_case_id")
    private TestCaseEntity testCase;

    @Column(name = "result", length = 50, nullable = false)
    private String result; // Should be an enum: Pass, Fail

    @ManyToOne
    @JoinColumn(name = "executed_by")
    private UserEntity executedBy;

    @Column(name = "execution_date")
    private LocalDate executionDate;

    @Column(name = "comments", columnDefinition = "TEXT")
    private String comments;
}
