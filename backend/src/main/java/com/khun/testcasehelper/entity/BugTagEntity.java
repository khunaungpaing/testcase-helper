package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "bug_tags")
public class BugTagEntity {
    @Id
    @ManyToOne
    @JoinColumn(name = "bug_id")
    private BugEntity bug;

    @Id
    @ManyToOne
    @JoinColumn(name = "tag_id")
    private TagEntity tag;
}
