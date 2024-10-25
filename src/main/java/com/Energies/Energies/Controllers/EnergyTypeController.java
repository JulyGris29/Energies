package com.Energies.Energies.Controllers;


import com.Energies.Energies.Entities.EnergyType;
import com.Energies.Energies.Entities.User;
import com.Energies.Energies.Services.EnergyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/energyType")
public class EnergyTypeController {

    @Autowired
    private EnergyTypeService energyTypeService;

    //Create or update User
    @PostMapping
    public ResponseEntity<EnergyType> createEnergyType(@RequestBody EnergyType energyType) {
        EnergyType saveEnergyType = energyTypeService.saveEnergyType(energyType);
        return new ResponseEntity<>(saveEnergyType, HttpStatus.CREATED);
    }

    @GetMapping("/{energyTypeId}")
    public ResponseEntity<EnergyType> getEnergyTypeById(@PathVariable int energyTypeId) {
        Optional<EnergyType> energyType = energyTypeService.getEnergyTypeById(energyTypeId);
        return energyType.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Get EnergyType by Id
   /* @GetMapping("/{energyTypeId}")
    public ResponseEntity<EnergyType> getEnergyTypeById(@PathVariable int energyType) {
        Optional<EnergyType> energyType = energyTypeService.getEnergyTypeById(energyTypeId);
        return energyType.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }*/



    //Get all EnergyType

    @GetMapping
    public ResponseEntity<List<EnergyType>> getAllEnergyType() {
        List<EnergyType> energyType = energyTypeService.getAllEnergyType();
        return new ResponseEntity<>(energyType, HttpStatus.OK);

    }

    //Delete EnergyType by Id
    @DeleteMapping("/{energyTypeId}")
    public ResponseEntity<Void> deleteEnergyType(@PathVariable int energyTypeId) {
        energyTypeService.deleteEnergyType(energyTypeId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

   /* @PutMapping("/energyTypeId")
    public ResponseEntity<Void> updateEnergyType(@PathVariable int energyTypeId, @RequestBody EnergyType energyType) {
        EnergyType partialUpdateEnergyType  = new EnergyType();
        if (energyType.getName() != null) {
            partialUpdateEnergyType.setName(energyType.getName());
        }*/

}
