package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// Bugs entity
@Entity
@Table(name = "bugs")
@Data
@NoArgsConstructor
public class Bug {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bug_seq")
    @SequenceGenerator(name = "bug_seq", sequenceName = "bug_id_seq", allocationSize = 1)
    private Long bugId;

    @Column(nullable = false)
    private String title;

    private String description;

    private String status;

    private LocalDate reportedDate;

    private LocalDate resolvedDate;

    @ManyToOne
    @JoinColumn(name = "reported_by")
    private User reportedBy;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
