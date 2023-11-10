package org.wecancodeit.virtualpets.models;

import org.wecancodeit.virtualpets.enums.*;


/**
 * Class to handle dogs
 */
public class DogModel extends OrganicPetModel {
    public DogModel() {
    }

   public DogModel(String name, String imageUrl, String breed, int age,
            PetHealthEnum health, PetMoodEnum mood, TempermentEnum temperment, boolean fixed){
                super(name, PetTypeEnum.ORGANIC_DOG,  imageUrl, breed, age, health,  mood,  temperment,fixed);
            }

    @Override
    public String toString() {
        return "DogModel " + super.toString();
    }

}
