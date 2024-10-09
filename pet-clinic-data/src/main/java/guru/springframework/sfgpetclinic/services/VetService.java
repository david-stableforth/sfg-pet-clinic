package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 *  Created by ds on 9/10/24
 */
public interface VetService {

    Vet findByLastName(String lastName);
    Vet findById(Long id);
    Vet save(Vet vet);
    Set <Vet> findAll();
}
