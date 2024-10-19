package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

// Tags entity
@Entity
@Table(name = "tags")
@Data
@NoArgsConstructor
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tag_seq")
    @SequenceGenerator(name = "tag_seq", sequenceName = "tag_id_seq", allocationSize = 1)
    private Long tagId;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private String tagType;
}
