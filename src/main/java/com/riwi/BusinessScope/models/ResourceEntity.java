package com.riwi.BusinessScope.models;

import com.riwi.BusinessScope.utils.ResourceType;
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

    @ManyToOne
    @JoinColumn(name = "idPublication")
    private PublicationEntity idPublication;

    public ResourceEntity(Integer id, String resourceUrl, ResourceType resourceType, String description, PublicationEntity idPublication) {
        this.id = id;
        this.resourceUrl = resourceUrl;
        this.resourceType = resourceType;
        this.description = description;
        this.idPublication = idPublication;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public PublicationEntity getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(PublicationEntity idPublication) {
        this.idPublication = idPublication;
    }
}



