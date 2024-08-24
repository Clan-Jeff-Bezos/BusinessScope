package com.riwi.BusinessScope.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity(name = "publication")
public class PublicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 150,nullable = false)
    private String title;
    @Lob
    @Column(nullable = false)
    private String description;
    @Column(nullable = false, updatable = false, columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime datePublication;
    private UserEntity idUser;
    private CategoryEntity idCategory;

    public PublicationEntity() {
    }

    public PublicationEntity(int id, String title, String description, LocalDateTime datePublication, UserEntity idUser, CategoryEntity idCategory) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.datePublication = datePublication;
        this.idUser = idUser;
        this.idCategory = idCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDateTime datePublication) {
        this.datePublication = datePublication;
    }

    public UserEntity getIdUser() {
        return idUser;
    }

    public void setIdUser(UserEntity idUser) {
        this.idUser = idUser;
    }

    public CategoryEntity getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(CategoryEntity idCategory) {
        this.idCategory = idCategory;
    }

    @Override
    public String toString() {
        return "PublicationEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", datePublication=" + datePublication +
                ", idUser=" + idUser +
                ", idCategory=" + idCategory +
                '}';
    }
}
