package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 *  Created by ds on 9/10/24
 */
public interface PetService {
    Pet findByLastName(String lastName);
    Pet  findById(Long id);
    Pet save(Pet  pet);
    Set<Pet> findAll();
}
