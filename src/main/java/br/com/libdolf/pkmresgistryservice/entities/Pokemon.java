package br.com.libdolf.pkmresgistryservice.entities;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Pokemon {
    @Id
    private Integer id;
    private String name;
    private String specie;
    private String nature;
    private String originalTrainer;
    private String item;
    private PokemonStatus status;
    @ElementCollection
    private List<Move> moves;
    @ManyToOne
    private Box box;

}
