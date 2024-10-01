package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

    @Data
    @Entity

    public class Bloc implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idBloc ;
        private String nomBloc ;
        private Long capaciteBloc;


        @OneToMany(mappedBy = "bloc")
        private Set<Chambre> chambres;

        @ManyToOne
        private Foyer foyer;
}
