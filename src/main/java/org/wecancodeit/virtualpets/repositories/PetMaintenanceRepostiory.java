package org.wecancodeit.virtualpets.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpets.models.PetMaintenanceModel;

/**
 * Handles the pet maintenance task table
 */
public interface PetMaintenanceRepostiory extends CrudRepository<PetMaintenanceModel,Long> {
    PetMaintenanceModel findByName(String name);
}
