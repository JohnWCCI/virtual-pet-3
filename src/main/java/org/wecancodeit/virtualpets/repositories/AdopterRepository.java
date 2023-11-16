package org.wecancodeit.virtualpets.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpets.models.AdopterModel;

/**
 * Handles the Adopter Table
 */
public interface AdopterRepository extends CrudRepository<AdopterModel,Long> {
     List<AdopterModel> findByName(String name);
}
