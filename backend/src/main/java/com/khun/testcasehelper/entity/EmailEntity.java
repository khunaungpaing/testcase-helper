package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "emails")
public class EmailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "email_seq")
    @SequenceGenerator(name = "email_seq", sequenceName = "emails_email_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "recipient_id")
    private UserEntity recipient;

    @Column(name = "related_entity_id")
    private Long relatedEntityId;

    @Column(name = "email_type", length = 50, nullable = false)
    private String emailType;

    @Column(name = "subject", length = 255, nullable = false)
    private String subject;

    @Column(name = "body", nullable = false)
    private String body;

    @Column(name = "sent_status", nullable = false)
    private Boolean sentStatus = false;

    @Column(name = "sent_date")
    private LocalDateTime sentDate;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
