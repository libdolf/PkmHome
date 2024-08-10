package br.com.libdolf.pkmresgistryservice.controllers;

import br.com.libdolf.pkmresgistryservice.controllers.dtos.TrainerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1/trainer")
public class TrainerController {
    private TrainerService service;

    @PostMapping()
    public ResponseEntity<?> saveNewTrainer(@RequestBody TrainerDto trainer) {
        return ResponseEntity.ok(service.save(trainer));
    }
    @GetMapping()
    public ResponseEntity<?> getTrainer(@RequestParam Long trainerId) {
        return ResponseEntity.ok(service.getTrainer(trainerId));
    }
    @PutMapping()
    public ResponseEntity<?> updateTrainer(@RequestParam Long trainerId, @RequestBody TrainerDto trainerUpdated) {
        return ResponseEntity.ok(service.updateTrainer(trainerUpdated));
    }
    @DeleteMapping()
    public ResponseEntity<?> deleteTrainer(@RequestParam Long trainerId) {
        return ResponseEntity.ok(service.deleteTrainer(trainerId));
    }
}
