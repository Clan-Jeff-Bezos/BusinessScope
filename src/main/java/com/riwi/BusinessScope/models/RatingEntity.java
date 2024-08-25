package com.riwi.BusinessScope.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
@Table(name ="Rating")
public class RatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String text;

    @Column(nullable = false)
    private Byte score;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime ratingDate;

    @ManyToOne
    @JoinColumn(name = "idUser")
    private UserEntity idUser;

    @ManyToOne
    @JoinColumn(name = "idPublication")
    private PublicationEntity idPublication;

    public RatingEntity() {
    }

    public RatingEntity(Integer id, PublicationEntity idPublication, UserEntity idUser, LocalDateTime ratingDate, Byte score, String text) {
        this.id = id;
        this.idPublication = idPublication;
        this.idUser = idUser;
        this.ratingDate = ratingDate;
        this.score = score;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public LocalDateTime getRatingDate() {
        return ratingDate;
    }

    public void setRatingDate(LocalDateTime ratingDate) {
        this.ratingDate = ratingDate;
    }

    public UserEntity getIdUser() {
        return idUser;
    }

    public void setIdUser(UserEntity idUser) {
        this.idUser = idUser;
    }

    public PublicationEntity getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(PublicationEntity idPublication) {
        this.idPublication = idPublication;
    }
}