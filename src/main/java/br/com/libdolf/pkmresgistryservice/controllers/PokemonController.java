package br.com.libdolf.pkmresgistryservice.controllers;

import br.com.libdolf.pkmresgistryservice.controllers.dtos.PokemonDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1/pokemon")
public class PokemonController {
    private PokemonService service;

    @PostMapping()
    public ResponseEntity<?> saveNewPokemon(
            @RequestParam Long trainerId,
            @RequestParam Integer box,
            @RequestBody PokemonDto pokemonDto) {
        return ResponseEntity.ok(service.saveNewPokemon(trainerId, box, pokemonDto));
    }

    @GetMapping()
    public ResponseEntity<?> getAllPokemons(@RequestParam Long trainerId) {
        return ResponseEntity.ok(service.getAllPokemons(trainerId));
    }

    //TODO preciso pensar em uma implementação melhor desses gets :/
    @GetMapping("/{pokemonId}")
    public ResponseEntity<?> getPokemon(@PathVariable Long pokemonId) {
        return ResponseEntity.ok(service.getAllPokemons(trainerId));
    }

    @PutMapping
    public ResponseEntity<?> updatePokemon(@RequestParam Long PokemonId, @RequestBody PokemonDto pokemonUpdated) {
        return ResponseEntity.ok(service.updatePokemon(pokemonUpdated));
    }
    @DeleteMapping()
    public ResponseEntity<?> deletePokemon(@RequestParam Long pokemonId) {
        return ResponseEntity.ok(service.deletePokemon(pokemonId));
    }

}
