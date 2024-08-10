package br.com.libdolf.pkmresgistryservice.entities;

import jakarta.persistence.CascadeType;
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
    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Box> boxes;
}
