package com.khun.testcasehelper.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

// Composite key for TestCaseModule
@Data
@NoArgsConstructor
@Embeddable
public class TestCaseModuleId implements Serializable {
    private Long testCaseId;
    private Long moduleId;
}
