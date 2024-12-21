package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "databases")
public class DatabaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "database_seq")
    @SequenceGenerator(name = "database_seq", sequenceName = "databases_database_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "version", length = 50)
    private String version;
}
