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
    private int idUserSender;
    private int idUseraddressee;
    private int idVenture;

    public MessageEntity() {
    }

    public MessageEntity(int id, String content, LocalDateTime shipDate, int idUserSender, int idUseraddressee, int idVenture) {
        this.id = id;
        this.content = content;
        this.shipDate = shipDate;
        this.idUserSender = idUserSender;
        this.idUseraddressee = idUseraddressee;
        this.idVenture = idVenture;
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

    public int getIdUserSender() {
        return idUserSender;
    }

    public void setIdUserSender(int idUserSender) {
        this.idUserSender = idUserSender;
    }

    public int getIdUseraddressee() {
        return idUseraddressee;
    }

    public void setIdUseraddressee(int idUseraddressee) {
        this.idUseraddressee = idUseraddressee;
    }

    public int getIdVenture() {
        return idVenture;
    }

    public void setIdVenture(int idVenture) {
        this.idVenture = idVenture;
    }
}

}
