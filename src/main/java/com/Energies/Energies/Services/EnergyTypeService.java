package com.Energies.Energies.Services;


import com.Energies.Energies.Entities.EnergyType;
import com.Energies.Energies.Repository.EnergyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnergyTypeService {

    @Autowired
    private EnergyTypeRepository energyTypeRepository;

    //Insert or update EnergyType
    public EnergyType saveEnergyType(EnergyType energyType) {
        return energyTypeRepository.save(energyType);
    }
    //Get EnergyTypeId by id
    public Optional<EnergyType> getEnergyTypeById(int energyTypeId) {
        return energyTypeRepository.findById(energyTypeId);
    }

    //Get all EnergyType
    public List<EnergyType> getAllEnergyType() {
        return energyTypeRepository.findAll();
    }

    //Delete User by id
    public void deleteEnergyType(int energyTypeId) {
        energyTypeRepository.deleteById(energyTypeId);
    }

}
