package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

// Test Case Tags join table
@Entity
@Table(name = "test_case_tags")
@Data
@NoArgsConstructor
public class TestCaseTag {
    @EmbeddedId
    private TestCaseTagId id;

    @ManyToOne
    @MapsId("testCaseId")
    @JoinColumn(name = "test_case_id")
    private TestCase testCase;

    @ManyToOne
    @MapsId("tagId")
    @JoinColumn(name = "tag_id")
    private Tag tag;
}
