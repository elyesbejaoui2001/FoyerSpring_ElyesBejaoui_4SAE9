package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idU;
    ;
    private String nomU;
    private String adresse;

    @OneToOne
    private Foyer foyer;
}
