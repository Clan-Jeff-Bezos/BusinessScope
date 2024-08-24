package com.riwi.BusinessScope.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
@Table(name="collaborator")
public class CollaboratorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="collaboratorRole", nullable=false, length=150)
    private String collaboratorRole;
    @Column(name="idEntrepreneurship")
    private EntrepreneurshipEntity idEntrepreneurship;
    private UserEntity idUser;

    public CollaboratorEntity() {
    }

    public CollaboratorEntity(int id, String collaboratorRole, EntrepreneurshipEntity idEntrepreneurship, UserEntity idUser) {
        this.id = id;
        this.collaboratorRole = collaboratorRole;
        this.idEntrepreneurship = idEntrepreneurship;
        this.idUser = idUser;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollaboratorRole() {
        return collaboratorRole;
    }

    public void setCollaboratorRole(String collaboratorRole) {
        this.collaboratorRole = collaboratorRole;
    }

    public EntrepreneurshipEntity getIdEntrepreneurship() {
        return idEntrepreneurship;
    }

    public void setIdEntrepreneurship(EntrepreneurshipEntity idEntrepreneurship) {
        this.idEntrepreneurship = idEntrepreneurship;
    }

    public UserEntity getIdUser() {
        return idUser;
    }

    public void setIdUser(UserEntity idUser) {
        this.idUser = idUser;
    }

}