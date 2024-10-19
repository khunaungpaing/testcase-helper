package com.khun.testcasehelper.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

// Composite key for TestCaseTag
@Data
@NoArgsConstructor
@Embeddable
public class TestCaseTagId implements Serializable {
    private Long testCaseId;
    private Long tagId;
}
