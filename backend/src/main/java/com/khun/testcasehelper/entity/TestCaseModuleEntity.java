package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "test_case_modules")
public class TestCaseModuleEntity {
    @Id
    @ManyToOne
    @JoinColumn(name = "test_case_id")
    private TestCaseEntity testCase;

    @Id
    @ManyToOne
    @JoinColumn(name = "module_id")
    private ModuleEntity module;
}
