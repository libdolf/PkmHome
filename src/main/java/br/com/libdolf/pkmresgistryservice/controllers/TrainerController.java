package br.com.libdolf.pkmresgistryservice.controllers;

import br.com.libdolf.pkmresgistryservice.controllers.dtos.TrainerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/trainer")
public class TrainerController {
    private TrainerService service;

    @PostMapping("/save")
    public ResponseEntity<?> saveNewTrainer(@RequestBody TrainerDto trainer) {
        return ResponseEntity.ok(service.save(trainer));
    }

    //get a trainer status

    //put

    // delete
}
