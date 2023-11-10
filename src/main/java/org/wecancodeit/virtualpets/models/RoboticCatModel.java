package org.wecancodeit.virtualpets.models;

import org.wecancodeit.virtualpets.enums.*;

/**
 * Class to manage Robotic cats
 */
public class RoboticCatModel extends RoboticPetModel {

    public RoboticCatModel() {

    }

    public RoboticCatModel(String name, String imageUrl, String model, String manufacturer,
            int energyLevel, int oilLevel, RoboticHealthEnum health) {
        super(name, PetTypeEnum.ROBOTIC_CAT, imageUrl, model, manufacturer,
                energyLevel, oilLevel, health);
    }

    @Override
    public String toString() {
        return "RoboticCatModel " + super.toString();
    }

    
}
