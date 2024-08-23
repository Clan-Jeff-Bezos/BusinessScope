package com.riwi.BusinessScope.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
@Table(name  = "Resource")
public class ResourceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ResourceType resourceType;

    @Column(nullable = false, length = 255)
    private String resourceUrl;

    @Column(columnDefinition = "TEXT")
    private String description;


    private Publication publication;

    public ResourceEntity(Integer id, ResourceType resourceType, String resourceUrl, String description, Publication publication) {
        this.id = id;
        this.resourceType = resourceType;
        this.resourceUrl = resourceUrl;
        this.description = description;
        this.publication = publication;
    }

    public ResourceEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }
}
