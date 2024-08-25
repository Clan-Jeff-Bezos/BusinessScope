package com.riwi.BusinessScope.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity(name = "event")
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 150,nullable = false)
    private String title;
    @Lob
    private String description;
    @Column(nullable = false)
    private LocalDateTime dateStart;
    @Column(nullable = false)
    private LocalDateTime dateEnd;
    private String location;

    @ManyToOne
    @JoinColumn(name = "idPublication")
    private PublicationEntity idPublication;

    public EventEntity() {
    }

    public EventEntity(int id, String title, String description, LocalDateTime dateStart, LocalDateTime dateEnd, String location, PublicationEntity idPublication) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.location = location;
        this.idPublication = idPublication;
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

    public LocalDateTime getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public PublicationEntity getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(PublicationEntity idPublication) {
        this.idPublication = idPublication;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "EventEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", location='" + location + '\'' +
                ", idPublication=" + idPublication +
                '}';
    }
}
