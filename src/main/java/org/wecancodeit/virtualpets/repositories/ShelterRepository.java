package org.wecancodeit.virtualpets.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpets.models.ShelterModel;

/**
 * Handles the Shelter table
 */
public interface ShelterRepository extends CrudRepository<ShelterModel,Long> {
    ShelterModel findByName(String name);
}
