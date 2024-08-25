package com.riwi.BusinessScope.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
@Table(name="message")
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="content", nullable=false,columnDefinition = "TEXT")
    private String content;
    @Column(name ="shipDate",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime shipDate;
    @ManyToOne
    @JoinColumn(name = "idUserSender")
    private UserEntity idUserSender;
    @ManyToOne
    @JoinColumn(name = "isUseraddressee")
    private UserEntity idUseraddressee;
    @ManyToOne
    @JoinColumn(name = "idEntrepreneurship")
    private EntrepreneurshipEntity idEntrepreneurship;


    public MessageEntity() {
    }

    public MessageEntity(int id, String content, LocalDateTime shipDate, UserEntity idUserSender, UserEntity idUseraddressee, EntrepreneurshipEntity idEntrepreneurship) {
        this.id = id;
        this.content = content;
        this.shipDate = shipDate;
        this.idUserSender = idUserSender;
        this.idUseraddressee = idUseraddressee;
        this.idEntrepreneurship = idEntrepreneurship;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getShipDate() {
        return shipDate;
    }

    public void setShipDate(LocalDateTime shipDate) {
        this.shipDate = shipDate;
    }

    public UserEntity getIdUserSender() {
        return idUserSender;
    }

    public void setIdUserSender(UserEntity idUserSender) {
        this.idUserSender = idUserSender;
    }

    public UserEntity getIdUseraddressee() {
        return idUseraddressee;
    }

    public void setIdUseraddressee(UserEntity idUseraddressee) {
        this.idUseraddressee = idUseraddressee;
    }

    public EntrepreneurshipEntity getIdEntrepreneurship() {
        return idEntrepreneurship;
    }

    public void setIdEntrepreneurship(EntrepreneurshipEntity idEntrepreneurship) {
        this.idEntrepreneurship = idEntrepreneurship;
    }

}

