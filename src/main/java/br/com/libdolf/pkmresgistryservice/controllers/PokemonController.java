package br.com.libdolf.pkmresgistryservice.controllers;

import br.com.libdolf.pkmresgistryservice.entities.Pokemon;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1/pokemon")
public class PokemonController {
    private PokemonService service;

    @PostMapping("/save")
    public ResponseEntity<?> saveNewPokemon(
            @RequestParam Long trainerId,
            @RequestParam Integer box,
            @RequestBody Pokemon pokemon) {
        return ResponseEntity.ok(service.saveNewPokemon(trainerId, box, pokemon));
    }

    @GetMapping()
    public ResponseEntity<?> getAllPokemons(@RequestParam Long trainerId) {
        return ResponseEntity.ok(service.getAllPokemons(trainerId));
    }

    // get a single pkm

    // put

    // delete

}
