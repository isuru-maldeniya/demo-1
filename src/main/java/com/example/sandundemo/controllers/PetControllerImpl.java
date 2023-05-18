package com.example.sandundemo.controllers;

import com.example.sandundemo.entities.Pet;
import com.example.sandundemo.models.PetModel;
import com.example.sandundemo.service.PetService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pet")
@AllArgsConstructor
public class PetControllerImpl implements PetController{

    private final PetService petService;

    @Override
    @PostMapping
    public ResponseEntity createPet(@RequestBody PetModel petModel) {
        Pet pet = petService.createPet(petModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(pet);
    }

    @Override
    @GetMapping(value = "/{id}")
    public ResponseEntity getPetById(@PathVariable String id) {
        Pet petById = petService.getPetById(id);
        return ResponseEntity.ok(petById);
    }
}
