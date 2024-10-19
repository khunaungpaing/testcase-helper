package com.khun.testcasehelper.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_preferences")
public class UserPreferenceEntity {
    @Id
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(name = "email_on_new", nullable = false)
    private Boolean emailOnNew = true;

    @Column(name = "email_on_assigned", nullable = false)
    private Boolean emailOnAssigned = true;

    @Column(name = "email_on_feedback", nullable = false)
    private Boolean emailOnFeedback = true;

    @Column(name = "email_on_resolved", nullable = false)
    private Boolean emailOnResolved = true;

    @Column(name = "email_on_closed", nullable = false)
    private Boolean emailOnClosed = true;

    @Column(name = "email_on_reopened", nullable = false)
    private Boolean emailOnReopened = true;

    @Column(name = "email_on_bug_comments", nullable = false)
    private Boolean emailOnBugComments = true;

    @Column(name = "email_on_testcase_comments", nullable = false)
    private Boolean emailOnTestcaseComments = true;

    @Column(name = "email_on_status", nullable = false)
    private Boolean emailOnStatus = true;

    @Column(name = "email_on_priority", nullable = false)
    private Boolean emailOnPriority = true;

    @Column(name = "email_on_priority_min_severity", length = 50)
    private String emailOnPriorityMinSeverity;

    @Column(name = "email_on_status_min_severity", length = 50)
    private String emailOnStatusMinSeverity;

    @Column(name = "email_on_bug_comments_min_severity", length = 50)
    private String emailOnBugCommentsMinSeverity;

    @Column(name = "email_on_testcase_comments_min_severity", length = 50)
    private String emailOnTestcaseCommentsMinSeverity;

    @Column(name = "email_on_reopened_min_severity", length = 50)
    private String emailOnReopenedMinSeverity;

    @Column(name = "email_on_closed_min_severity", length = 50)
    private String emailOnClosedMinSeverity;

    @Column(name = "email_on_resolved_min_severity", length = 50)
    private String emailOnResolvedMinSeverity;

    @Column(name = "email_on_feedback_min_severity", length = 50)
    private String emailOnFeedbackMinSeverity;

    @Column(name = "email_on_assigned_min_severity", length = 50)
    private String emailOnAssignedMinSeverity;

    @Column(name = "email_on_new_min_severity", length = 50)
    private String emailOnNewMinSeverity;

    @Column(name = "comments_order", length = 4)
    private String commentsOrder;

    @Column(name = "theme", length = 20)
    private String theme; // dark/light mode
}
