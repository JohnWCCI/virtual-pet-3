package org.wecancodeit.virtualpets.models;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

/**
 * Class to manage the shelter
 */
@Entity
@Table(name = "T_Shelter")
public class ShelterModel extends ContactModel {
    private String webSite;

    @OneToMany(mappedBy = "shelterModel", cascade = CascadeType.ALL)
    private Collection<RoboticPetModel> roboicPets;

    @OneToMany(mappedBy = "shelterModel", cascade = CascadeType.ALL)
    private Collection<OrganicPetModel> organicPets;

     @OneToMany(mappedBy = "shelterModel", cascade = CascadeType.ALL)
    private Collection<AdopterModel> adopterModels;

   @ManyToMany(mappedBy = "shelters")
    private Set<VolunteerModel> volunteers = new HashSet<>();

    public ShelterModel() {
    }

    public ShelterModel(String name, String address, String city, String state, String zip, String phone, String email,
            String imageUrl, String webSite) {
        super(name, address, city, state, zip, phone, email, imageUrl);
        this.webSite = webSite;

    }

    public String getWebSite() {
        return webSite;
    }

    public Collection<RoboticPetModel> getRoboicPets() {
        return roboicPets;
    }

    public Collection<OrganicPetModel> getOrganicPets() {
        return organicPets;
    }

    public Set<VolunteerModel> getVolunteer() {
        return volunteers;
    }
}
