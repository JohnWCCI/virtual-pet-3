package org.wecancodeit.virtualpets.models;

import org.wecancodeit.virtualpets.enums.*;


/**
 * Class to handle cats
 */
public class CatModel extends OrganicPetModel {
    public CatModel() {
    }

   public CatModel(String name, String imageUrl, String breed, int age,
            PetHealthEnum health, PetMoodEnum mood, TempermentEnum temperment, boolean fixed){
                super(name, PetTypeEnum.ORGANIC_CAT,  imageUrl, breed, age, health,  mood,  temperment,fixed);
            }

    @Override
    public String toString() {
        return "CatModel " + super.toString();
    }

}
