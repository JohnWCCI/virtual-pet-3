package org.wecancodeit.virtualpets.models;

import org.wecancodeit.virtualpets.enums.*;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * abstract class for OrganicPet 
 */
@Entity
@Table(name="T_organicPet")
public class OrganicPetModel extends PetModel {
    private String breed;
    private int age;
    private PetHealthEnum health;
    private PetMoodEnum mood;
    private TempermentEnum temperment;
    private boolean fixed;
    
    @ManyToOne
    private ShelterModel shelterModel;
    
    public OrganicPetModel() {
    }

    public OrganicPetModel(String name, PetTypeEnum petType, String imageUrl, String breed, int age,
            PetHealthEnum health, PetMoodEnum mood, TempermentEnum temperment, boolean fixed) {
        super(name, petType, imageUrl);
        this.breed = breed;
        this.age = age;
        this.health = health;
        this.mood = mood;
        this.temperment = temperment;
        this.fixed = fixed;
    }

     public ShelterModel getShelterModel() {
        return shelterModel;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public PetHealthEnum getHealth() {
        return health;
    }

    public PetMoodEnum getMood() {
        return mood;
    }

    public TempermentEnum getTemperment() {
        return temperment;
    }

    public boolean isFixed() {
        return fixed;
    }

    @Override
    public String toString() {
        return super.toString() + "OrganicPetModel [breed=" + breed + ", age=" + age + ", health=" + health + ", mood=" + mood
                + ", temperment=" + temperment + ", fixed=" + fixed + "]";
    }

    
    
    
    
}
