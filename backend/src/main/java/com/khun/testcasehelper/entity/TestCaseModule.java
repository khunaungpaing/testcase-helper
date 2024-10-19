package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

// Test Case Modules join table
@Entity
@Table(name = "test_case_modules")
@Data
@NoArgsConstructor
public class TestCaseModule {
    @EmbeddedId
    private TestCaseModuleId id;

    @ManyToOne
    @MapsId("testCaseId")
    @JoinColumn(name = "test_case_id")
    private TestCase testCase;

    @ManyToOne
    @MapsId("moduleId")
    @JoinColumn(name = "module_id")
    private Module module;
}
