package com.ust.EcoTrack.Controller;

import com.ust.EcoTrack.Service.EnergyConsumptionService;
import com.ust.EcoTrack.model.EnergyConsumption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EcoTrack/energy")
public class EnergyConsumptionController {

    @Autowired
    private EnergyConsumptionService energyService;

    @PostMapping("/addData")
    public ResponseEntity<EnergyConsumption> addEnergyConsumption(@RequestBody EnergyConsumption energyConsumption) {
        EnergyConsumption savedData = energyService.saveEnergyConsumption(energyConsumption);
        return new ResponseEntity<>(savedData, HttpStatus.CREATED);
    }

    @GetMapping("/analytics/{userId}")
    public ResponseEntity<List<EnergyConsumption>> getAnalytics(@PathVariable int userId) {
        List<EnergyConsumption> analytics = energyService.getUserTrendsForEnergyConsumption(userId);
        return new ResponseEntity<>(analytics, HttpStatus.OK);
    }
}
