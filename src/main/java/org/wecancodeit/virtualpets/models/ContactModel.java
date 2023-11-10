package org.wecancodeit.virtualpets.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Size;

/**
 * Maintain Contact information
 */
@MappedSuperclass
public abstract class ContactModel {
    @Id
    @GeneratedValue
    private long id;

    @Column(length=50, nullable = false)
    private String name;

    @Column(length=150, nullable = true)
    private String address;

     @Column(length=50, nullable = true)
    private String city;

    @Column(length=2, nullable = true)
    private String state;

    @Size(max = 10, min =5)
    @Column(length=10, nullable = false)
    private String zip;

    @Column(length=10, nullable = true)
    private String phone;

    @Column(length=150, nullable = false)
    private String email;
    
    private String imageUrl;
   
    public ContactModel() {
    }

    public ContactModel(String name, String address, String city, String state, String zip, String phone, String email,
            String imageUrl) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "ContactModel [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", state="
                + state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + ", imageUrl=" + imageUrl + "]";
    }

    
}
