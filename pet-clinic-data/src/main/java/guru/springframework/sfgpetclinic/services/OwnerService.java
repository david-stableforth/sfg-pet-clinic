package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 *  Created by ds on 9/10/24
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);



}
