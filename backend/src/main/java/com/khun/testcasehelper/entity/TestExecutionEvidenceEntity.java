package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "test_execution_evidence")
public class TestExecutionEvidenceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "evidence_seq")
    @SequenceGenerator(name = "evidence_seq", sequenceName = "test_execution_evidence_evidence_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "execution_id", nullable = false)
    private TestExecutionRecordEntity execution;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Column(name = "file_type", length = 50, nullable = false)
    private String fileType;

    @Column(name = "file_path", nullable = false)
    private String filePath;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
}
