package org.wecancodeit.virtualpets.models;

import org.wecancodeit.virtualpets.enums.PetTypeEnum;

import jakarta.persistence.*;

/**
 * Default class fields for all pets
 */
@MappedSuperclass
public abstract class PetModel {
    @Id
    @GeneratedValue()
    private long id;

    @Column(length=50, nullable = false)
    private String name;

    private PetTypeEnum petType;
    
    private String imageUrl;

   

    public PetModel() {
    }

    public PetModel(String name, PetTypeEnum petType, String imageUrl) {
        this.name = name;
        this.petType = petType;
        this.imageUrl = imageUrl;
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

    public PetTypeEnum getPetType() {
        return petType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "PetModel [id=" + id + ", name=" + name + ", petType=" + petType + ", imageUrl=" + imageUrl
                +  ", todo=" + "todo" + "]";
    }

}
