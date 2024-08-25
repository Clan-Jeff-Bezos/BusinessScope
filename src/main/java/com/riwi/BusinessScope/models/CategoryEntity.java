package com.riwi.BusinessScope.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.util.Set;

@Entity(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50,nullable = false)
    private String name;
    @OneToMany(mappedBy = "idCategory")
    private Set<EntrepreneurshipEntity> entrepreneurship;
    @OneToMany(mappedBy = "idCategory")
    private Set<PublicationEntity> publication;

    public CategoryEntity() {
    }

    public CategoryEntity(int id, String name, Set<EntrepreneurshipEntity> entrepreneurship, Set<PublicationEntity> publication) {
        this.id = id;
        this.name = name;
        this.entrepreneurship = entrepreneurship;
        this.publication = publication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<PublicationEntity> getPublication() {
        return publication;
    }

    public void setPublication(Set<PublicationEntity> publication) {
        this.publication = publication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<EntrepreneurshipEntity> getEntrepreneurship() {
        return entrepreneurship;
    }

    public void setEntrepreneurship(Set<EntrepreneurshipEntity> entrepreneurship) {
        this.entrepreneurship = entrepreneurship;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", entrepreneurship=" + entrepreneurship +
                ", publication=" + publication +
                '}';
    }
}
