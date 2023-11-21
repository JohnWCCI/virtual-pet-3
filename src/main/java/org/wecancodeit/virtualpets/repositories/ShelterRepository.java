package org.wecancodeit.virtualpets.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpets.models.ShelterModel;

/**
 * Handles the Shelter table
 */
public interface ShelterRepository extends CrudRepository<ShelterModel,Long> {
    List<ShelterModel> findByName(String name);
}
