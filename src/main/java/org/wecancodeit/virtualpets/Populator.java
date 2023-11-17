package org.wecancodeit.virtualpets;

import org.springframework.stereotype.Component;
import org.wecancodeit.virtualpets.dto.AdopterProfileDto;
import org.wecancodeit.virtualpets.dto.ShelterProfileDto;
import org.wecancodeit.virtualpets.services.*;
import org.springframework.boot.CommandLineRunner;

@Component
public class Populator implements CommandLineRunner {

    private AdopterService adopterService;
    private ShelterService shelterService;

    public Populator(AdopterService adopterService, ShelterService shelterService) {
        this.adopterService = adopterService;
        this.shelterService = shelterService;
    }

    @Override
    public void run(String... args) throws Exception {

        // Add Shelters
        ShelterProfileDto shelter1 = new ShelterProfileDto(0l, "City Shelter", "130 west 1st st", "Columbus", "Oh",
                "43224", "6142649811", "NoWay@no.com", "no image", "Website.com");
        shelter1 = shelterService.update(shelter1);

        ShelterProfileDto shelter2 = new ShelterProfileDto(0l, "State Shelter", "130 west 1st st", "Columbus", "Oh",
                "43224", "6142649811", "NoWay@no.com", "no image", "Website.com");
        shelter2 = shelterService.update(shelter2);

        ShelterProfileDto shelter3 = new ShelterProfileDto(0l, "Dog Shelter", "130 west 1st st", "Columbus", "Oh",
                "43224", "6142649811", "NoWay@no.com", "no image", "Website.com");
        shelter3 = shelterService.update(shelter3);

        // Add adopters to Shelter
        for (int x = 0; x < 10; x++) {
            AdopterProfileDto adopter1 = new AdopterProfileDto(0l, "Jane Doe" + x, "112 main st", "Plymouth", "IN",
                    "46563",
                    "6166156678", "Nomail@no.com", "NoImage", "Dog");
            adopter1 = adopterService.update(adopter1, shelter1);
        }
        for (int x = 0; x < 10; x++) {
            AdopterProfileDto adopter2 = new AdopterProfileDto(0l, "John Doe" + x, "112 main st", "Plymouth", "IN",
                    "46563",
                    "6166156678", "Nomail@no.com", "NoImage", "Dog");
            adopter2 = adopterService.update(adopter2, shelter2);
        }
        for (int x = 0; x < 10; x++) {
            AdopterProfileDto adopter3 = new AdopterProfileDto(0l, "Jim Smith " + x, "112 main st", "Plymouth",
                    "IN", "46563",
                    "6166156678", "Nomail@no.com", "NoImage", "Dog");
            adopter3 = adopterService.update(adopter3, shelter3);
        }
    }

}
