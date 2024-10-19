package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "users_user_id_seq", allocationSize = 1)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "role", length = 50, nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column(name = "email", length = 255, unique = true, nullable = false)
    private String email;

    private boolean active;
}


