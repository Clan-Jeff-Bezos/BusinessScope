package com.riwi.BusinessScope.models;


import jakarta.persistence.*;
import jakarta.persistence.Entity;
import java.time.LocalDate;

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
    @Enumerated(EnumType.STRING)
    @Column(nullable = false )
    private RolType rolType;

    public UserEntity() {
    }

    public UserEntity(String name, String email, String password, String biography, String phoneProfile, String website, LocalDate registrationDate, RolType rolType, int id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.biography = biography;
        this.phoneProfile = phoneProfile;
        this.website = website;
        this.registrationDate = registrationDate;
        this.rolType = rolType;
        this.id = id;
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

    public RolType getRolType() {
        return rolType;
    }

    public void setRolType(RolType rolType) {
        this.rolType = rolType;
    }
}
