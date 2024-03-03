package loclt.sfp.sfqpetclinicpractice.services;

import loclt.sfp.sfqpetclinicpractice.model.Pet;

import java.util.List;

public interface PetServices {
    Pet findById(Long id);
    Pet save(Pet pet);
    List<Pet> findAll();

    Pet delete(Long id);
}
