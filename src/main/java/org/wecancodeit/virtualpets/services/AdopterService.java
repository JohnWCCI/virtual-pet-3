package org.wecancodeit.virtualpets.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.wecancodeit.virtualpets.dto.*;
import org.wecancodeit.virtualpets.models.*;
import org.wecancodeit.virtualpets.repositories.*;
import jakarta.annotation.Resource;

@Service
public class AdopterService {

    @Resource
    private AdopterRepository adopterRepository;

    public AdopterService(AdopterRepository adopterRepository) {
        this.adopterRepository = adopterRepository;
    }

    public AdopterProfileDto update(AdopterProfileDto dto, ShelterProfileDto shelter) {
        try {
            AdopterModel model = DataDtoConverts.convert(dto);
            model.setShelterModel(DataDtoConverts.convert(shelter));
            // TODO valdiation gose here
            model = adopterRepository.save(model);
            dto = DataDtoConverts.convert(model);
        } catch (Exception ex) {
            // TODO error handling here
        }
        return dto;
    }

    public void deleteById(long id) {
        try {
            adopterRepository.deleteById(id);
        } catch (Exception ex) {
            // TODO error handling here
        }
    }

    public Collection<AdopterProfileDto> findAll() {
        ArrayList<AdopterProfileDto> dtos = new ArrayList<>();
        Iterable<AdopterModel> adopters = adopterRepository.findAll();
        for (AdopterModel model : adopters) {
            dtos.add(DataDtoConverts.convert(model));
        }
        return dtos;
    }

    public AdopterProfileDto findById(long id) {
        Optional<AdopterModel> opAdopter = adopterRepository.findById(id);
        if (opAdopter.isPresent()) {
            return DataDtoConverts.convert(opAdopter.get());
        }
        return null;
    }

    public ContactInfoDto findContactInfo( long id){
        Optional<AdopterModel> opAdopter = adopterRepository.findById(id);
        if (opAdopter.isPresent()) {
            return new ContactInfoDto(id,opAdopter.get().getName(), opAdopter.get().getPhone());
        }
        return null;
    }


    public Collection<AdopterProfileDto> findByName(String name) {
        Collection<AdopterModel> adopters = adopterRepository.findByName(name);
        ArrayList<AdopterProfileDto> dtos = new ArrayList<>();
         for (AdopterModel model : adopters) {
            dtos.add(DataDtoConverts.convert(model));
        }
        return dtos;
    }

  
}
