package org.wecancodeit.virtualpets.models;

import org.wecancodeit.virtualpets.enums.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name="T_roboticPet")
public class RoboticPetModel extends PetModel {
    @Column(length=50, nullable = false)
    private String model;
    @Column(length=150, nullable = true)
    private String manufacturer;

    /**
     * Min and max values are based on precentage
     */
    @Min(0)
    @Max(100)
    private int energyLevel;
    /**
     * Min and max values are based on precentage
     */
    @Min(0)
    @Max(100)
    private int oilLevel;
    private RoboticHealthEnum health;

    @ManyToOne
    private ShelterModel shelterModel;
   
    public RoboticPetModel() {
    }

    public RoboticPetModel(String name, PetTypeEnum petType, String imageUrl, String model, String manufacturer,
            int energyLevel, int oilLevel, RoboticHealthEnum health) {
        super(name, petType, imageUrl);
        this.model = model;
        this.manufacturer = manufacturer;
        this.energyLevel = energyLevel;
        this.oilLevel = oilLevel;
        this.health = health;
    }

    public ShelterModel getShelterModel() {
        return shelterModel;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public RoboticHealthEnum getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return super.toString() + "RoboticPetModel [model=" + model + ", manufacturer=" + manufacturer + ", energyLevel=" + energyLevel
                + ", oilLevel=" + oilLevel + ", health=" + health + "]";
    }
   
    
}
