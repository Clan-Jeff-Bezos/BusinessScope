package com.riwi.BusinessScope.models;


import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="FollowUp")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FollowUpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="idUser")
    private int idUser;
    @Column(name="followUpDate",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime followUpDate;
    @Column(name="idventure")
    private int idventure;
}
