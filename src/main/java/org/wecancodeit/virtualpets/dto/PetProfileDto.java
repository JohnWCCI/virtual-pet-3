package org.wecancodeit.virtualpets.dto;

import org.wecancodeit.virtualpets.enums.PetTypeEnum;

public abstract class PetProfileDto {
    private long id;
    private String name;
    private PetTypeEnum petType;
    private String imageUrl;
    private long shelterModelId;

    public PetProfileDto() {
    }

    public PetProfileDto(long id, String name, PetTypeEnum petType, String imageUrl) {
        this.id = id;
        this.name = name;
        this.petType = petType;
        this.imageUrl = imageUrl;
    }

    public long ShelterModelId() {
        return shelterModelId;
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

    public PetTypeEnum getPetType() {
        return petType;
    }

    public void setPetType(PetTypeEnum petType) {
        this.petType = petType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
