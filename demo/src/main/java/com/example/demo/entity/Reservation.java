package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@Entity
@Data
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    ;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToMany()
    private Set<Etudiant> etudiants;
}
