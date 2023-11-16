package org.wecancodeit.virtualpets.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.wecancodeit.virtualpets.dto.AdopterDto;
import org.wecancodeit.virtualpets.models.AdopterModel;
import org.wecancodeit.virtualpets.repositories.AdopterRepository;

import jakarta.annotation.Resource;

@Service
public class AdopterService {

    @Resource
    private AdopterRepository adopterRepository;

    public AdopterService(AdopterRepository adopterRepository) {
        this.adopterRepository = adopterRepository;
    }

    public AdopterDto update(AdopterDto dto) {
        try {
            AdopterModel model = convertToModel(dto);
            // TODO valdiation gose here
            model = adopterRepository.save(model);
            dto = convertToDto(model);
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

    public Collection<AdopterDto> findAll() {
        ArrayList<AdopterDto> dtos = new ArrayList<>();
        Iterable<AdopterModel> adopters = adopterRepository.findAll();
        for (AdopterModel model : adopters) {
            dtos.add(convertToDto(model));
        }
        return dtos;
    }

    public AdopterDto findById(long id) {
        Optional<AdopterModel> opAdopter = adopterRepository.findById(id);
        if (opAdopter.isPresent()) {
            return convertToDto(opAdopter.get());
        }
        return null;
    }

    public Collection<AdopterDto> findByName(String name) {
        Collection<AdopterModel> adopters = adopterRepository.findByName(name);
        ArrayList<AdopterDto> dtos = new ArrayList<>();
         for (AdopterModel model : adopters) {
            dtos.add(convertToDto(model));
        }
        return dtos;
    }

    private AdopterModel convertToModel(AdopterDto dto) {
        AdopterModel adopter = new AdopterModel(
                dto.getName(), dto.getAddress(), dto.getCity(),
                dto.getState(), dto.getZip(), dto.getPhone(),
                dto.getEmail(), dto.getImageUrl(), dto.getPreferred());
        adopter.setId(dto.getId());
        return adopter;

    }

    private AdopterDto convertToDto(AdopterModel model) {
        AdopterDto adopter = new AdopterDto(model.getId(),
                model.getName(), model.getAddress(), model.getCity(),
                model.getState(), model.getZip(), model.getPhone(),
                model.getEmail(), model.getImageUrl(), model.getPreferred());
        adopter.setShelterModel(model.getShelterModel());
        return adopter;

    }
}
