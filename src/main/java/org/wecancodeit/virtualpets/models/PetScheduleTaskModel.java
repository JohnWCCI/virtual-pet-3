package org.wecancodeit.virtualpets.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Class for schedule task
 */
@Entity
@Table(name = "T_toDoTask")
public class PetScheduleTaskModel {
    @Id
    @GeneratedValue
    private long id;
    private long volunteerId;
    private long taskId;
    private long nextTime;
    private long petId;

    public PetScheduleTaskModel() {
    }

    public PetScheduleTaskModel(long volunteerId, long petId, long taskId, long nextTime) {
        this.volunteerId = volunteerId;
        this.petId = petId;
        this.taskId = taskId;
        this.nextTime = nextTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVolunteerId() {
        return volunteerId;
    }

    public long getPetId() {
        return petId;
    }

    public long getTaskId() {
        return taskId;
    }

    public long getNextTime() {
        return nextTime;
    }

    @Override
    public String toString() {
        return "PetScheduleTask [id=" + id + ", volunteerId=" + volunteerId + ", petId=" + petId + ", taskId=" + taskId
                + ", nextTime=" + nextTime + "]";
    }

}
