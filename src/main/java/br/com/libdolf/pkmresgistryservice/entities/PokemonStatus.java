package br.com.libdolf.pkmresgistryservice.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class PokemonStatus {
    private Integer hp;
    private Integer attack;
    private Integer defense;
    private Integer spAttack;
    private Integer spDefense;
    private Integer speed;
}
