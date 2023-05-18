package com.example.sandundemo.controllers;

import com.example.sandundemo.models.PetModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface PetController {
    ResponseEntity createPet(@RequestBody PetModel petModel);
    ResponseEntity getPetById(@PathVariable String id);
}
