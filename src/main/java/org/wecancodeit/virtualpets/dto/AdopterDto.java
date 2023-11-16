package org.wecancodeit.virtualpets.dto;

import org.wecancodeit.virtualpets.models.ShelterModel;

public class AdopterDto extends ContactProfileDto{
    private String preferred;
    private ShelterModel shelterModel;
    
    public AdopterDto() {
    }

    public AdopterDto(long id, String name, String address, String city, String state, String zip, String phone,
            String email, String imageUrl, String preferred) {
        super(id, name, address, city, state, zip, phone, email, imageUrl);
        this.preferred = preferred;
    }

    public String getPreferred() {
        return preferred;
    }

    public void setPreferred(String preferred) {
        this.preferred = preferred;
    }

    public ShelterModel getShelterModel() {
        return shelterModel;
    }

    public void setShelterModel(ShelterModel shelterModel) {
        this.shelterModel = shelterModel;
    }

}
