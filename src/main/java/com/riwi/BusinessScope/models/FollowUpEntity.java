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
    @ManyToOne
    @JoinColumn(name = "idUser")
    private UserEntity idUser;
    @Column(name="followUpDate",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime followUpDate;

    @ManyToOne
    @JoinColumn(name = "idEntrepreneurship")
    private EntrepreneurshipEntity idEntrepreneurship;

    public FollowUpEntity() {
    }

    public FollowUpEntity(int id, UserEntity idUser, LocalDateTime followUpDate, EntrepreneurshipEntity idEntrepreneurship) {
        this.id = id;
        this.idUser = idUser;
        this.followUpDate = followUpDate;
        this.idEntrepreneurship = idEntrepreneurship;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserEntity getIdUser() {
        return idUser;
    }

    public void setIdUser(UserEntity idUser) {
        this.idUser = idUser;
    }

    public LocalDateTime getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(LocalDateTime followUpDate) {
        this.followUpDate = followUpDate;
    }

    public EntrepreneurshipEntity getIdEntrepreneurship() {
        return idEntrepreneurship;
    }

    public void setIdEntrepreneurship(EntrepreneurshipEntity idEntrepreneurship) {
        this.idEntrepreneurship = idEntrepreneurship;
    }
}