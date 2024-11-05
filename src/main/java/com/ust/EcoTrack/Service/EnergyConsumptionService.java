package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.model.EnergyConsumption;

import  java.util.List;
import java.util.UUID;

public interface EnergyConsumptionService {
    EnergyConsumption saveEnergyConsumption(EnergyConsumption energyConsumption);

    List<EnergyConsumption> getUserTrendsForEnergyConsumption(String username);

}
