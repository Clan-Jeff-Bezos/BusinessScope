package com.riwi.BusinessScope.models;


import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="User")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    @Column(name="registrationDate", nullable=false)
    private LocalDate registrationDate=LocalDate.now();
    @Enumerated(EnumType.STRING)
    @Column(name
            = "rol", nullable = false)
    private Rol rol = Rol.EMPRENDEDOR;

    public enum Rol {
        EMPRENDEDOR, ADMINISTRADOR, COLABORADOR
    }
}
