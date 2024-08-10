package br.com.libdolf.pkmresgistryservice.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany(mappedBy = "box", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pokemon> pokemons;
    @ManyToOne
    private Trainer trainer;

}
