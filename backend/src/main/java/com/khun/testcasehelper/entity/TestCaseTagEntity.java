package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "test_case_tags")
public class TestCaseTagEntity {
    @Id
    @ManyToOne
    @JoinColumn(name = "test_case_id")
    private TestCaseEntity testCase;

    @Id
    @ManyToOne
    @JoinColumn(name = "tag_id")
    private TagEntity tag;
}
