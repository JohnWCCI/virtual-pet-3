package org.wecancodeit.virtualpets.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.wecancodeit.virtualpets.dto.ContactInfoDto;
import org.wecancodeit.virtualpets.dto.ShelterProfileDto;
import org.wecancodeit.virtualpets.models.ShelterModel;
import org.wecancodeit.virtualpets.repositories.ShelterRepository;
import org.wecancodeit.virtualpets.repositories.VolunteerRepository;

import jakarta.annotation.Resource;

@Service
public class ShelterService {
    @Resource
    private ShelterRepository shelterRepository;

    @Resource
    private VolunteerRepository volunteerRepository;

    public ShelterService(ShelterRepository shelterRepository, VolunteerRepository volunteerRepository) {
        this.shelterRepository = shelterRepository;
        this.volunteerRepository = volunteerRepository;
    }


    public ShelterProfileDto update(ShelterProfileDto dto) {
        try {
            ShelterModel model = DataDtoConverts.convert(dto);
            // TODO valdiation gose here
            model = shelterRepository.save(model);
            dto = DataDtoConverts.convert(model);
        } catch (Exception ex) {
            // TODO error handling here
        }
        return dto;
    }


    public void deleteById(long id) {
        try {
            shelterRepository.deleteById(id);
        } catch (Exception ex) {
            // TODO error handling here
        }
    }


    public Collection<ShelterProfileDto> findAll() {
        ArrayList<ShelterProfileDto> dtos = new ArrayList<>();
        Iterable<ShelterModel> shelters = shelterRepository.findAll();
        for (ShelterModel model : shelters) {
            dtos.add(DataDtoConverts.convert(model));
        }
        return dtos;
    }


    public ShelterProfileDto findById(long id) {
        Optional<ShelterModel> opShelter = shelterRepository.findById(id);
        if (opShelter.isPresent()) {
            return DataDtoConverts.convert(opShelter.get());
        }
        return null;
    }

    public ContactInfoDto findContactInfo(long id) {
        Optional<ShelterModel> opShelter = shelterRepository.findById(id);
        if (opShelter.isPresent()) {
            return new ContactInfoDto(id, opShelter.get().getName(), opShelter.get().getPhone());
        }
        return null;
    }


    public Collection<ShelterProfileDto> findByName(String name) {
        Collection<ShelterModel> shelters = shelterRepository.findByName(name);
        ArrayList<ShelterProfileDto> dtos = new ArrayList<>();
        for (ShelterModel model : shelters) {
            dtos.add(DataDtoConverts.convert(model));
        }
        return dtos;
    }
}
