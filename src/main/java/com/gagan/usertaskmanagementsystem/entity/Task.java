package com.gagan.usertaskmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Integer taskId;

    private String title;
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id") // The foreign key column in your DB
    private User user; // Matches the 'mappedBy' name in User entity
}