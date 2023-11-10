package org.wecancodeit.virtualpets.models;

import org.wecancodeit.virtualpets.enums.PetTypeEnum;

import jakarta.persistence.*;


/**
 * class to maintain a list of type of task
 * that need to be preformed on a pet
 */
@Entity
@Table(name="T_petMaintenance")
public class PetMaintenanceModel {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int frequency;
    private PetTypeEnum petType;
    private String effectedProperty;
    
    public PetMaintenanceModel() {
    }

    public PetMaintenanceModel(String name, int frequency, PetTypeEnum petType, String effectedProperty) {
        this.name = name;
        this.frequency = frequency;
        this.petType = petType;
        this.effectedProperty = effectedProperty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public PetTypeEnum getPetType() {
        return petType;
    }

    public String getEffectedProperty() {
        return effectedProperty;
    }

    
}
