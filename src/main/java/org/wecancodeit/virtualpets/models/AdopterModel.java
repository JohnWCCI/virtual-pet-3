package org.wecancodeit.virtualpets.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Class to manage Adopters
 */
@Entity
@Table(name="T_Adopter")
public class AdopterModel extends ContactModel{
   
    private String perfer;

    public AdopterModel() {
    }

    public AdopterModel(String name, String address, String city, String state, String zip, String phone, String email,
            String imageUrl, String perfer) {
        super(name, address, city, state, zip, phone, email, imageUrl);
        this.perfer = perfer;
    }

    public String getPerfer() {
        return perfer;
    }

}
