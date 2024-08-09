package br.com.libdolf.pkmresgistryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;


@Entity
public class Trainer {
    @Id
    private Long id;
    private String name;
    private Integer pokedex;
    @OneToMany
    private List<Box> boxes;

}
