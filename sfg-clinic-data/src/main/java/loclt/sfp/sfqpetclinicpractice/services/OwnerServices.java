package loclt.sfp.sfqpetclinicpractice.services;

import loclt.sfp.sfqpetclinicpractice.model.Owner;

import java.util.List;

public interface OwnerServices {
    Owner findById(Long id);
    Owner save(Owner pet);
    List<Owner> findAll();

    Owner delete(Long id);
}
