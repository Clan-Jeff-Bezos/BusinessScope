package com.riwi.BusinessScope.models;

import com.riwi.BusinessScope.utils.TypeSource;
import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity(name = "entrepreneurship")
public class EntrepreneurshipEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 150,nullable = false)
    private String title;
    @Lob
    @Column(nullable = false)
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeSource typeSource;
    @Column(nullable = false)
    private String urlsource;
    private CategoryEntity idCategory;

    public EntrepreneurshipEntity() {
    }

    public EntrepreneurshipEntity(int id, String title, String description, TypeSource typeSource, String urlsource, CategoryEntity idCategory) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.typeSource = typeSource;
        this.urlsource = urlsource;
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

    public TypeSource getTypeSource() {
        return typeSource;
    }

    public void setTypeSource(TypeSource typeSource) {
        this.typeSource = typeSource;
    }

    public String getUrlsource() {
        return urlsource;
    }

    public void setUrlsource(String urlsource) {
        this.urlsource = urlsource;
    }

    public CategoryEntity getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(CategoryEntity idCategory) {
        this.idCategory = idCategory;
    }

    @Override
    public String toString() {
        return "EntrepreneurshipEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", typeSource=" + typeSource +
                ", urlsource='" + urlsource + '\'' +
                ", idCategory=" + idCategory +
                '}';
    }
}
