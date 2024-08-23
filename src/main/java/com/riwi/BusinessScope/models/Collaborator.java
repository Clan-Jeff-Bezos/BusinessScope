package com.riwi.BusinessScope.models;


import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="collaborator")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collaborator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="collaboratorRol", nullable=false, length=150)
    private String collaboratorRol;
    @Column(name="idEntrepreneurship")
    private int idEntrepreneurship;
    @Column(name="idUser")
    private int idUser;


}
