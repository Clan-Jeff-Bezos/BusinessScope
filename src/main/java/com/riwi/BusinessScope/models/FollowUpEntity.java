package com.riwi.BusinessScope.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
@Table(name="follow")
public class FollowUpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idUser;
    @Column(name="followUpDate",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime followUpDate;
    private int idventure;


    public FollowUpEntity() {
    }

    public FollowUpEntity(int id, int idUser, LocalDateTime followUpDate, int idventure) {
        this.id = id;
        this.idUser = idUser;
        this.followUpDate = followUpDate;
        this.idventure = idventure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(LocalDateTime followUpDate) {
        this.followUpDate = followUpDate;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdventure() {
        return idventure;
    }

    public void setIdventure(int idventure) {
        this.idventure = idventure;
    }
}
