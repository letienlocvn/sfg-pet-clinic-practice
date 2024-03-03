package loclt.sfp.sfqpetclinicpractice.services;

import loclt.sfp.sfqpetclinicpractice.model.PetType;

import java.util.List;

public interface PetTypeServices {
    PetType findById(Long id);
    PetType save(PetType pet);
    List<PetType> findAll();

    PetType delete(Long id);
}
