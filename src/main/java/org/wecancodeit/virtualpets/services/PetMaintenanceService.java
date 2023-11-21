package org.wecancodeit.virtualpets.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.wecancodeit.virtualpets.dto.*;
import org.wecancodeit.virtualpets.models.*;
import org.wecancodeit.virtualpets.repositories.PetMaintenanceRepostiory;

import jakarta.annotation.Resource;

@Service
public class PetMaintenanceService {

    @Resource
    private PetMaintenanceRepostiory petMaintenanceRepostiory;

    public PetMaintenanceService(PetMaintenanceRepostiory petMaintenanceRepostiory) {
        this.petMaintenanceRepostiory = petMaintenanceRepostiory;
    }

    public PetMaintenanceProfileDto update(PetMaintenanceProfileDto dto) {
        try {
            PetMaintenanceModel model = DataDtoConverts.convert(dto);
            // TODO valdiation gose here
            petMaintenanceRepostiory.save(model);
            dto = DataDtoConverts.convert(model);
        } catch (Exception ex) {
            // TODO error handling here
        }
        return dto;
    }

    public void deleteById(long id) {
        try {
            petMaintenanceRepostiory.deleteById(id);
        } catch (Exception ex) {
            // TODO error handling here
        }
    }

     public Collection<PetMaintenanceProfileDto> findAll() {
        ArrayList<PetMaintenanceProfileDto> dtos = new ArrayList<>();
        Iterable<PetMaintenanceModel> models = petMaintenanceRepostiory.findAll();
        for (PetMaintenanceModel model : models) {
            dtos.add(DataDtoConverts.convert(model));
        }
        return dtos;
    }

    public PetMaintenanceProfileDto findById(long id) {
        Optional<PetMaintenanceModel> opModel = petMaintenanceRepostiory.findById(id);
        if (opModel.isPresent()) {
            return DataDtoConverts.convert(opModel.get());
        }
        return null;
    }

     public Collection<PetMaintenanceProfileDto> findByName(String name) {
        ArrayList<PetMaintenanceProfileDto> dtos = new ArrayList<>();
        Iterable<PetMaintenanceModel> models = petMaintenanceRepostiory.findByName(name);
        for (PetMaintenanceModel model : models) {
            dtos.add(DataDtoConverts.convert(model));
        }
        return dtos;
    }

}
