package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// Test Execution Records entity
@Entity
@Table(name = "test_execution_records")
@Data
@NoArgsConstructor
public class TestExecutionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "execution_record_seq")
    @SequenceGenerator(name = "execution_record_seq", sequenceName = "execution_record_id_seq", allocationSize = 1)
    private Long executionRecordId;

    @Column(nullable = false)
    private LocalDate executionDate;

    @Column(nullable = false)
    private String result;

    private String notes;

    @ManyToOne
    @JoinColumn(name = "test_case_id")
    private TestCase testCase;

    @ManyToOne
    @JoinColumn(name = "executed_by")
    private User executedBy;
}
