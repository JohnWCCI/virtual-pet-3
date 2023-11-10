package org.wecancodeit.virtualpets.dto;

import org.wecancodeit.virtualpets.enums.*;


/**
 * The Dto for all organic pets
 */
public class OrganicPetProfileDto extends PetProfileDto {
   
    private String breed;
    private int age;
    private PetHealthEnum health;
    private PetMoodEnum mood;
    private TempermentEnum temperment;
    private boolean fixed;

    public OrganicPetProfileDto() {
    }
    
    public OrganicPetProfileDto(long id, String name, PetTypeEnum petType, String imageUrl, String breed, int age,
            PetHealthEnum health, PetMoodEnum mood, TempermentEnum temperment, boolean fixed) {
        super(id, name, petType, imageUrl);
        this.breed = breed;
        this.age = age;
        this.health = health;
        this.mood = mood;
        this.temperment = temperment;
        this.fixed = fixed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PetHealthEnum getHealth() {
        return health;
    }

    public void setHealth(PetHealthEnum health) {
        this.health = health;
    }

    public PetMoodEnum getMood() {
        return mood;
    }

    public void setMood(PetMoodEnum mood) {
        this.mood = mood;
    }

    public TempermentEnum getTemperment() {
        return temperment;
    }

    public void setTemperment(TempermentEnum temperment) {
        this.temperment = temperment;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }
    
}
