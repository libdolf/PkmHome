package br.com.libdolf.pkmresgistryservice.controllers.dtos;

public record PokemonStatusDto(
        Integer hp,
        Integer attack,
        Integer defense,
        Integer spAttack,
        Integer spDefense,
        Integer speed
) {
}
