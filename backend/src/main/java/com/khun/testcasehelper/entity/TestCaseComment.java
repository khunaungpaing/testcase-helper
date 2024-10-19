package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// Test Case Comments entity
@Entity
@Table(name = "test_case_comments")
@Data
@NoArgsConstructor
public class TestCaseComment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_case_comment_seq")
    @SequenceGenerator(name = "test_case_comment_seq", sequenceName = "comment_id_seq", allocationSize = 1)
    private Long commentId;

    @ManyToOne
    @JoinColumn(name = "test_case_id")
    private TestCase testCase;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private LocalDate createdAt;

    @Column(nullable = false)
    private LocalDate updatedAt;

    private String attachmentFilename;

    private String attachmentType;

    private String attachmentPath;
}
