package org.wecancodeit.virtualpets.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.virtualpets.models.PetScheduleTaskModel;
import java.util.List;
/**
 * Handles the todo Task for pets/Volunteer
 */
public interface PetScheduleTaskRepository extends CrudRepository<PetScheduleTaskModel, Long> {
    List<PetScheduleTaskModel> findByPetId(long petId);
    List<PetScheduleTaskModel> findByVolunteerId(long volunteerId);
    List<PetScheduleTaskModel> findByTaskId(long taskId);
}
