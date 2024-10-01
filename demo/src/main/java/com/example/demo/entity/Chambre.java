package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typec;
    @OneToMany
    private Set<Reservation> reservations;

    @ManyToOne
    private Bloc bloc;


}
