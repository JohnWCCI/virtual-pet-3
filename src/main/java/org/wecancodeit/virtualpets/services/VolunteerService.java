package org.wecancodeit.virtualpets.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.wecancodeit.virtualpets.dto.ContactInfoDto;
import org.wecancodeit.virtualpets.dto.VolunteerProfileDto;
import org.wecancodeit.virtualpets.models.ShelterModel;
import org.wecancodeit.virtualpets.models.VolunteerModel;
import org.wecancodeit.virtualpets.repositories.ShelterRepository;
import org.wecancodeit.virtualpets.repositories.VolunteerRepository;

import jakarta.annotation.Resource;

@Service
public class VolunteerService {

    @Resource
    private final VolunteerRepository volunteerRepository;

    @Resource
    private final ShelterRepository shelterRepository;

    public VolunteerService(VolunteerRepository volunteerRepository, ShelterRepository shelterRepository) {
        this.volunteerRepository = volunteerRepository;
        this.shelterRepository = shelterRepository;
    }

    public void addShelter(long shelterId, long VolunteerId) {
        Optional<VolunteerModel> opVolunteer = volunteerRepository.findById(VolunteerId);
        Optional<ShelterModel> opModel = shelterRepository.findById(shelterId);

        if (opVolunteer.isPresent() && opModel.isPresent()) {
            Set<ShelterModel> shelters = new HashSet<>();
            shelters.add(opModel.get());
            
            VolunteerModel volunteerModel = opVolunteer.get();
            for (ShelterModel model : volunteerModel.getShelters()) {
                shelters.add(model);
            }

            volunteerModel.setShelters(shelters);
            volunteerRepository.save(volunteerModel);

        }
    }

    public VolunteerProfileDto update(VolunteerProfileDto dto) {
        try {
            VolunteerModel model = DataDtoConverts.convert(dto);

            // TODO valdiation gose here
            model = volunteerRepository.save(model);
            dto = DataDtoConverts.convert(model);
        } catch (Exception ex) {
            // TODO error handling here
        }
        return dto;
    }

    public void deleteById(long id) {
        try {
            volunteerRepository.deleteById(id);
        } catch (Exception ex) {
            // TODO error handling here
        }
    }

    public Collection<VolunteerProfileDto> findAll() {
        ArrayList<VolunteerProfileDto> dtos = new ArrayList<>();
        Iterable<VolunteerModel> volunteers = volunteerRepository.findAll();
        for (VolunteerModel model : volunteers) {
            dtos.add(DataDtoConverts.convert(model));
        }
        return dtos;
    }

    public VolunteerProfileDto findById(long id) {
        Optional<VolunteerModel> opVolunteer = volunteerRepository.findById(id);
        if (opVolunteer.isPresent()) {
            return DataDtoConverts.convert(opVolunteer.get());
        }
        return null;
    }

    public ContactInfoDto findContactInfo(long id) {
        Optional<VolunteerModel> opVolunteer = volunteerRepository.findById(id);
        if (opVolunteer.isPresent()) {
            return new ContactInfoDto(id, opVolunteer.get().getName(), opVolunteer.get().getPhone());
        }
        return null;
    }

    public Collection<VolunteerProfileDto> findByName(String name) {
        Collection<VolunteerModel> volunteers = volunteerRepository.findByName(name);
        ArrayList<VolunteerProfileDto> dtos = new ArrayList<>();
        for (VolunteerModel model : volunteers) {
            dtos.add(DataDtoConverts.convert(model));
        }
        return dtos;
    }

}
