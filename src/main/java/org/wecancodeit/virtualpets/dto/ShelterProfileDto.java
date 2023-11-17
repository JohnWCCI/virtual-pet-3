package org.wecancodeit.virtualpets.dto;

public class ShelterProfileDto extends ContactProfileDto {
    private String webSite;

    public ShelterProfileDto(long id, String name, String address, String city, String state, String zip, String phone,
            String email, String imageUrl, String webSite) {
        super(id, name, address, city, state, zip, phone, email, imageUrl);
        this.webSite = webSite;
        this.setId(id);
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    
}
