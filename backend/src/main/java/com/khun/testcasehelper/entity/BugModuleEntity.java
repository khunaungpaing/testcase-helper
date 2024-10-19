package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "bug_modules")
public class BugModuleEntity {
    @Id
    @ManyToOne
    @JoinColumn(name = "bug_id")
    private BugEntity bug;

    @Id
    @ManyToOne
    @JoinColumn(name = "module_id")
    private ModuleEntity module;
}
