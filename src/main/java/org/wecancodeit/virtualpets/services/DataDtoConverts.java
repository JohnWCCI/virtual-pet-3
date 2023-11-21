package org.wecancodeit.virtualpets.services;

import org.wecancodeit.virtualpets.dto.*;
import org.wecancodeit.virtualpets.models.*;

public final class DataDtoConverts {

    protected static final AdopterModel convert(AdopterProfileDto dto) {
        AdopterModel adopter = new AdopterModel(
                dto.getName(), dto.getAddress(), dto.getCity(),
                dto.getState(), dto.getZip(), dto.getPhone(),
                dto.getEmail(), dto.getImageUrl(), dto.getPreferred());
        adopter.setId(dto.getId());
        return adopter;

    }

    protected static final AdopterProfileDto convert(AdopterModel model) {
        AdopterProfileDto adopter = new AdopterProfileDto(model.getId(),
                model.getName(), model.getAddress(), model.getCity(),
                model.getState(), model.getZip(), model.getPhone(),
                model.getEmail(), model.getImageUrl(), model.getPreferred());
        adopter.setShelterModel(model.getShelterModel());
        return adopter;
    }

    protected static final ShelterModel convert(ShelterProfileDto dto) {
        ShelterModel shelter = new ShelterModel(
                dto.getName(), dto.getAddress(), dto.getCity(),
                dto.getState(), dto.getZip(), dto.getPhone(),
                dto.getEmail(), dto.getImageUrl(), dto.getWebSite());
                shelter.setId(dto.getId());
        return shelter;

    }

    protected static final ShelterProfileDto convert(ShelterModel model) {
        ShelterProfileDto adopter = new ShelterProfileDto(model.getId(),
                model.getName(), model.getAddress(), model.getCity(),
                model.getState(), model.getZip(), model.getPhone(),
                model.getEmail(), model.getImageUrl(), model.getWebSite());
        return adopter;

    }
    
 protected static final VolunteerModel convert(VolunteerProfileDto dto) {
        VolunteerModel shelter = new VolunteerModel(
                dto.getName(), dto.getAddress(), dto.getCity(),
                dto.getState(), dto.getZip(), dto.getPhone(),
                dto.getEmail(), dto.getImageUrl());
                shelter.setId(dto.getId());
        return shelter;
    }

    protected static final VolunteerProfileDto convert(VolunteerModel model) {
        VolunteerProfileDto volunteer = new VolunteerProfileDto(model.getId(),
                model.getName(), model.getAddress(), model.getCity(),
                model.getState(), model.getZip(), model.getPhone(),
                model.getEmail(), model.getImageUrl());
        return volunteer;
    }

    protected static final PetMaintenanceProfileDto convert(PetMaintenanceModel model){
        PetMaintenanceProfileDto maintenance = new PetMaintenanceProfileDto(
            model.getId(), model.getName(), 
            model.getFrequency(),model.getPetType(),
            model.getEffectedProperty());
        return maintenance;      
    }
 protected static final PetMaintenanceModel convert(PetMaintenanceProfileDto model){
        PetMaintenanceModel maintenance = new PetMaintenanceModel(
            model.getName(), 
            model.getFrequency(),model.getPetType(),
            model.getEffectedProperty());
            maintenance.setId(model.getId());
        return maintenance;
        
           
    }
}
