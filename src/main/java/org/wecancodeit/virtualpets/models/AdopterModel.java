package org.wecancodeit.virtualpets.models;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Class to manage Adopters
 */
@Entity
@Table(name="T_Adopter")
public class AdopterModel extends ContactModel{
   
    private String preferred;
    
    @ManyToOne
    private ShelterModel shelterModel;


    public AdopterModel() {
    }

    public AdopterModel(String name, String address, String city, String state, String zip, String phone, String email,
            String imageUrl, String preferred) {
        super(name, address, city, state, zip, phone, email, imageUrl);
        this.preferred = preferred;
    }

    public String getPreferred() {
        return preferred;
    }

    public ShelterModel getShelterModel() {
        return shelterModel;
    }

    public void setShelterModel(ShelterModel shelterModel) {
        this.shelterModel = shelterModel;
    }

    
}
