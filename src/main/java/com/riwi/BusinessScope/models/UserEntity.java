package com.riwi.BusinessScope.models;


import com.riwi.BusinessScope.utils.RolType;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="user")

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name",nullable=false,length=100)
    private String name;
    @Column(name="email",nullable=false,unique=true,length=100)
    private String email;
    @Column(name="password",nullable=false,length=100)
    private String password;
    @Column(name="biography", columnDefinition = "TEXT")
    private String biography;
    @Column(name="phoneProfile", length=255)
    private String phoneProfile;
    @Column(name="website", length=255)
    private String website;
    @Column(name="registrationDate", nullable=false,columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private LocalDate registrationDate;
    @OneToMany(mappedBy = "idUser")
    private Set<CollaboratorEntity> collaborator;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false )
    private RolType rolType;
    @OneToMany(mappedBy = "idUser")
    private Set<FollowUpEntity> follow;
    @OneToMany(mappedBy = "idUser")
    private Set<PublicationEntity>publication;

    @OneToMany(mappedBy = "idUserSender")
    private Set<MessageEntity> messageSender;

    @OneToMany(mappedBy = "idUseraddressee")
    private Set<MessageEntity> messageAddressee;

    @OneToMany(mappedBy = "idUser")
    private Set<RatingEntity>rating;

    public UserEntity() {
    }

    public UserEntity(int id, String email, String name, String password, String biography, String phoneProfile, String website, LocalDate registrationDate, RolType rolType, Set<CollaboratorEntity> collaborator, Set<FollowUpEntity> follow, Set<MessageEntity> messageSender, Set<PublicationEntity> publication, Set<MessageEntity> messageAddressee, Set<RatingEntity> rating) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.biography = biography;
        this.phoneProfile = phoneProfile;
        this.website = website;
        this.registrationDate = registrationDate;
        this.rolType = rolType;
        this.collaborator = collaborator;
        this.follow = follow;
        this.messageSender = messageSender;
        this.publication = publication;
        this.messageAddressee = messageAddressee;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getPhoneProfile() {
        return phoneProfile;
    }

    public void setPhoneProfile(String phoneProfile) {
        this.phoneProfile = phoneProfile;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Set<CollaboratorEntity> getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Set<CollaboratorEntity> collaborator) {
        this.collaborator = collaborator;
    }

    public RolType getRolType() {
        return rolType;
    }

    public void setRolType(RolType rolType) {
        this.rolType = rolType;
    }

    public Set<FollowUpEntity> getFollow() {
        return follow;
    }

    public void setFollow(Set<FollowUpEntity> follow) {
        this.follow = follow;
    }

    public Set<MessageEntity> getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(Set<MessageEntity> messageSender) {
        this.messageSender = messageSender;
    }

    public Set<PublicationEntity> getPublication() {
        return publication;
    }

    public void setPublication(Set<PublicationEntity> publication) {
        this.publication = publication;
    }

    public Set<MessageEntity> getMessageAddressee() {
        return messageAddressee;
    }

    public void setMessageAddressee(Set<MessageEntity> messageAddressee) {
        this.messageAddressee = messageAddressee;
    }

    public Set<RatingEntity> getRating() {
        return rating;
    }

    public void setRating(Set<RatingEntity> rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", biography='" + biography + '\'' +
                ", phoneProfile='" + phoneProfile + '\'' +
                ", website='" + website + '\'' +
                ", registrationDate=" + registrationDate +
                ", collaborator=" + collaborator +
                ", rolType=" + rolType +
                ", follow=" + follow +
                ", publication=" + publication +
                ", messageSender=" + messageSender +
                ", messageAddressee=" + messageAddressee +
                ", rating=" + rating +
                '}';
    }
}
