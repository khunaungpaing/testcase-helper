package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "test_assignment_modules")
public class TestAssignmentModuleEntity {
    @Id
    @ManyToOne
    @JoinColumn(name = "assignment_id")
    private TestAssignmentEntity assignment;

    @Id
    @ManyToOne
    @JoinColumn(name = "module_id")
    private ModuleEntity module;
}
