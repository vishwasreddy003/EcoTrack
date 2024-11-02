package com.ust.EcoTrack.Controller;

import com.ust.EcoTrack.Service.EnergyConsumptionService;
import com.ust.EcoTrack.model.EnergyConsumption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EcoTrack/energy")
public class EnergyConsumptionController {

    @Autowired
    private EnergyConsumptionService energyService;


    @PostMapping("/addData")
    public EnergyConsumption addEnergyConsumption(@RequestBody  EnergyConsumption energyConsumption){
        return energyService.saveEnergyConsumption(energyConsumption);
    }


    @GetMapping("/analytics/{userId}")
    public List<EnergyConsumption> getAnalytics(@PathVariable int userId){
        return energyService.getUserTrendsForEnergyConsumption(userId);
    }

}
