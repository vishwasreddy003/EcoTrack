package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.model.EnergyConsumption;

import  java.util.List;
public interface EnergyConsumptionService {
    EnergyConsumption saveEnergyConsumption(EnergyConsumption energyConsumption);

    List<EnergyConsumption> getUserTrendsForEnergyConsumption(int userId);

}
