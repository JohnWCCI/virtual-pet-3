package org.wecancodeit.virtualpets.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpets.models.OrganicPetModel;
/**
 * Handles the Organtic Pet table
 */
public interface OrganticPetRepository extends CrudRepository<OrganicPetModel,Long>{
        OrganicPetModel findByName(String name);
} 
