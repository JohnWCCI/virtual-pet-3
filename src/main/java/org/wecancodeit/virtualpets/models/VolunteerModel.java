package org.wecancodeit.virtualpets.models;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 * Class to manage Volunteers
 */
@Entity
@Table(name = "T_volunteer")
public class VolunteerModel extends ContactModel {

    // private List<ShelterModel> shelters;
    // private List<PetModel> pets;

    public VolunteerModel() {
    }

    public VolunteerModel(String name, String address, String city, String state, String zip, String phone,
            String email, String imageUrl) {
        super(name, address, city, state, zip, phone, email, imageUrl);
    }

    @ManyToMany(mappedBy = "volunteer")
    private Collection<ShelterModel> shelters;

    public Collection<ShelterModel> getShelters() {
        return shelters;
    }
}
