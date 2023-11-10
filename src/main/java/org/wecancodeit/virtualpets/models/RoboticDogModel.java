package org.wecancodeit.virtualpets.models;

import org.wecancodeit.virtualpets.enums.*;

/**
 * Class to manage the Robotic Dog
 */
public class RoboticDogModel extends RoboticPetModel {

    public RoboticDogModel() {

    }

    public RoboticDogModel(String name, String imageUrl, String model, String manufacturer,
            int energyLevel, int oilLevel, RoboticHealthEnum health) {
        super(name, PetTypeEnum.ROBOTIC_DOG, imageUrl, model, manufacturer,
                energyLevel, oilLevel, health);
    }

    @Override
    public String toString() {
        return "RoboticDogModel " + super.toString();
    }

    
}
