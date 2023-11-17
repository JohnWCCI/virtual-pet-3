package org.wecancodeit.virtualpets.services;

import org.wecancodeit.virtualpets.dto.AdopterProfileDto;
import org.wecancodeit.virtualpets.dto.OrganicPetProfileDto;
import org.wecancodeit.virtualpets.dto.ShelterProfileDto;
import org.wecancodeit.virtualpets.models.AdopterModel;
import org.wecancodeit.virtualpets.models.OrganicPetModel;
import org.wecancodeit.virtualpets.models.ShelterModel;

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
    
}
