package com.riwi.BusinessScope.models;


import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name="Message")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="content", nullable=false,columnDefinition = "TEXT")
    private String content;
    @Column(name ="shipDate",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime shipDate;
    @Column(name="idUserSender")
    private int idUserSender;
    @Column(name="idUseraddressee")
    private int idUseraddressee;
    @Column(name="idVenture")
    private int idVenture;

}
