package com.ust.EcoTrack.service;

import com.ust.EcoTrack.model.EnergyConsumption;

import  java.util.List;

public interface EnergyConsumptionService {
    EnergyConsumption saveEnergyConsumption(EnergyConsumption energyConsumption);

    List<EnergyConsumption> getUserTrendsForEnergyConsumption(String username);

}
