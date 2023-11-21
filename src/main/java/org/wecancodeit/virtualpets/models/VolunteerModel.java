package org.wecancodeit.virtualpets.models;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

/**
 * Class to manage Volunteers
 */
@Entity
@Table(name = "T_volunteer")
public class VolunteerModel extends ContactModel {

 
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "shelter_volunteer", 
    joinColumns = @JoinColumn(name = "volunteer_id"), 
    inverseJoinColumns = @JoinColumn(name = "shelter_id"))
    private Set<ShelterModel> shelters = new HashSet<>();

    public VolunteerModel() {
    }

    public VolunteerModel(String name, String address, String city, String state, String zip, String phone,
            String email, String imageUrl) {
        super(name, address, city, state, zip, phone, email, imageUrl);
    }

    public Set<ShelterModel> getShelters() {
        return shelters;
    }

    public void setShelters(Set<ShelterModel> shelters) {
        this.shelters = shelters;
    }
}
