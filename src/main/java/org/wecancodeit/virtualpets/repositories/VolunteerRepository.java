package org.wecancodeit.virtualpets.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpets.models.VolunteerModel;

/**
 * This will handle the data table CRUD operations
 */
public interface VolunteerRepository extends CrudRepository<VolunteerModel, Long> {
    VolunteerModel findByName(String name);
}
