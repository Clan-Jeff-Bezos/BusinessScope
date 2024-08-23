package com.riwi.BusinessScope.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
@Table(name="collaborator")
public class CollaboratorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="collaboratorRol", nullable=false, length=150)
    private String collaboratorRol;
    @Column(name="idEntrepreneurship")
    private int idEntrepreneurship;
    private int idUser;

    public CollaboratorEntity() {
    }

    public CollaboratorEntity(int id, String collaboratorRol, int idEntrepreneurship, int idUser) {
        this.id = id;
        this.collaboratorRol = collaboratorRol;
        this.idEntrepreneurship = idEntrepreneurship;
        this.idUser = idUser;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollaboratorRol() {
        return collaboratorRol;
    }

    public void setCollaboratorRol(String collaboratorRol) {
        this.collaboratorRol = collaboratorRol;
    }

    public int getIdEntrepreneurship() {
        return idEntrepreneurship;
    }

    public void setIdEntrepreneurship(int idEntrepreneurship) {
        this.idEntrepreneurship = idEntrepreneurship;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
