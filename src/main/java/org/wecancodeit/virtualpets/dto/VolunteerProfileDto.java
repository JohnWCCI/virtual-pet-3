package org.wecancodeit.virtualpets.dto;

public class VolunteerProfileDto extends ContactProfileDto{
    
    public VolunteerProfileDto(long id, String name, String address, String city, String state, String zip,
            String phone, String email, String imageUrl) {
        super(id, name, address, city, state, zip, phone, email, imageUrl);
    }

}
