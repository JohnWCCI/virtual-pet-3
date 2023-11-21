package org.wecancodeit.virtualpets.repositories;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpets.models.VolunteerModel;

/**
 * This will handle the data table CRUD operations
 */
public interface VolunteerRepository extends CrudRepository<VolunteerModel, Long> {
    Collection<VolunteerModel> findByName(String name);
}
