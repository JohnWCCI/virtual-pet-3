package org.wecancodeit.virtualpets.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpets.models.RoboticPetModel;

/**
 * Handles the Robotic pet Data Table
 */
public interface RoboticPetRepository extends CrudRepository<RoboticPetModel, Long> {
    RoboticPetModel findByName(String name);
}
