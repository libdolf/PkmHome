package br.com.libdolf.pkmresgistryservice.controllers.dtos;

import java.util.List;

public record PokemonDto(
        Integer id,
        String name,
        String specie,
        String nature,
        String originalTrainer,
        String item,
        PokemonStatusDto status,
        List<MoveDto> moves,
        Integer boxId
) {
}
