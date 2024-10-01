package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;
@Entity
@Data
public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idF ;
    private String nomF ;
    private Long capaciteF;

    @OneToOne(mappedBy = "foyer")
    private Universite universiteF;

    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;

}
