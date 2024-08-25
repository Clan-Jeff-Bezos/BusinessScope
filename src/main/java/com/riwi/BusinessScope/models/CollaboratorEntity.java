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

    @ManyToOne
    @JoinColumn(name = "idEntrepreneurship")
    private EntrepreneurshipEntity idEntrepreneurship;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private UserEntity idUser;

    public CollaboratorEntity() {
    }

    public CollaboratorEntity(int id, String collaboratorRole, UserEntity idUser, EntrepreneurshipEntity idEntrepreneurship) {
        this.id = id;
        this.collaboratorRole = collaboratorRole;
        this.idUser = idUser;
        this.idEntrepreneurship = idEntrepreneurship;
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

    @Override
    public String toString() {
        return "CollaboratorEntity{" +
                "id=" + id +
                ", collaboratorRole='" + collaboratorRole + '\'' +
                ", idEntrepreneurship=" + idEntrepreneurship +
                ", idUser=" + idUser +
                '}';
    }
}