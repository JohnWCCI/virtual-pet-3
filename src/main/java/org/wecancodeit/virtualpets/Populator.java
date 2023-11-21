package org.wecancodeit.virtualpets;

import org.springframework.stereotype.Component;
import org.wecancodeit.virtualpets.dto.AdopterProfileDto;
import org.wecancodeit.virtualpets.dto.PetMaintenanceProfileDto;
import org.wecancodeit.virtualpets.dto.ShelterProfileDto;
import org.wecancodeit.virtualpets.dto.VolunteerProfileDto;
import org.wecancodeit.virtualpets.enums.PetTypeEnum;
import org.wecancodeit.virtualpets.models.VolunteerModel;
import org.wecancodeit.virtualpets.services.*;
import org.springframework.boot.CommandLineRunner;

@Component
public class Populator implements CommandLineRunner {

    private AdopterService adopterService;
    private ShelterService shelterService;
    private VolunteerService volunteerService;
    private PetMaintenanceService maintenanceService;

    public Populator(AdopterService adopterService, ShelterService shelterService, VolunteerService volunteerService,
            PetMaintenanceService maintenanceService) {
        this.adopterService = adopterService;
        this.shelterService = shelterService;
        this.volunteerService = volunteerService;
        this.maintenanceService = maintenanceService;
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

        for (int x = 0; x < 10; x++) {
            VolunteerProfileDto volunteer = new VolunteerProfileDto(0l, "Jim Smith " + x, "112 main st", "Plymouth",
                    "IN", "46563",
                    "6166156678", "Nomail@no.com", "NoImage");
            volunteer = volunteerService.update(volunteer);
            volunteerService.addShelter(shelter1.getId(), volunteer.getId());
            volunteerService.addShelter(shelter2.getId(), volunteer.getId());
            volunteerService.addShelter(shelter3.getId(), volunteer.getId());
        }

       
            PetMaintenanceProfileDto profileDto1 = new PetMaintenanceProfileDto(0,"Feed Pet",24,PetTypeEnum.ORGANIC_DOG,"Health");
            PetMaintenanceProfileDto profileDto2 = new PetMaintenanceProfileDto(0,"Feed Pet",24,PetTypeEnum.ORGANIC_CAT,"Health");
         PetMaintenanceProfileDto profileDto3 = new PetMaintenanceProfileDto(0,"Change Oil",24,PetTypeEnum.ROBOTIC_CAT,"Health");
PetMaintenanceProfileDto profileDto4 = new PetMaintenanceProfileDto(0,"Change Oil",24,PetTypeEnum.ROBOTIC_CAT,"Health");
    }

}
