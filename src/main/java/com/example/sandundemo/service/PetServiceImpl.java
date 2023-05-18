package com.example.sandundemo.service;

import com.example.sandundemo.entities.Pet;
import com.example.sandundemo.entities.PetRepository;
import com.example.sandundemo.models.PetModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class PetServiceImpl implements PetService{

    private final PetRepository petRepository;

    @Override
    public Pet createPet(PetModel petModel) {
        Pet pet = new Pet();
        pet.setName(petModel.getName());
        pet.setTag(petModel.getTag());
        return petRepository.save(pet);
    }

    @Override
    public Pet getPetById(String id) {
        Optional<Pet> petOptional = petRepository.findById(id);
        if(petOptional.isEmpty()){
            log.error("pet not found");
            return new Pet();
        }else {
            return petOptional.get();
        }
    }
}
