package org.wecancodeit.virtualpets.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpets.models.AdopterModel;

/**
 * Handles the Adopter Table
 */
public interface AdopterRepository extends CrudRepository<AdopterModel,Long> {
     AdopterModel findByName(String name);
}
