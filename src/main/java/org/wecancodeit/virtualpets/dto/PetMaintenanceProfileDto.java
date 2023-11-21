package org.wecancodeit.virtualpets.dto;

import org.wecancodeit.virtualpets.enums.PetTypeEnum;


public class PetMaintenanceProfileDto {
       private long id;   
    private String name;
    private int frequency;
    private PetTypeEnum petType;
    private String effectedProperty;
    
    public PetMaintenanceProfileDto() {
    }

    public PetMaintenanceProfileDto(long id, String name, int frequency, PetTypeEnum petType, String effectedProperty) {
        this.id = id;
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

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public PetTypeEnum getPetType() {
        return petType;
    }

    public void setPetType(PetTypeEnum petType) {
        this.petType = petType;
    }

    public String getEffectedProperty() {
        return effectedProperty;
    }

    public void setEffectedProperty(String effectedProperty) {
        this.effectedProperty = effectedProperty;
    }

    
    
}
