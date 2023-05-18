package com.example.sandundemo.service;

import com.example.sandundemo.entities.Pet;
import com.example.sandundemo.models.PetModel;

public interface PetService {
    Pet createPet(PetModel petModel);
    Pet getPetById(String id);
}
