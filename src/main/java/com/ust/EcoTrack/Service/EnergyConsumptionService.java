package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.model.EnergyConsumption;

import  java.util.List;
public interface EnergyConsumptionService {
    public EnergyConsumption saveEnergyConsumption(EnergyConsumption energyConsumption);

    public List<EnergyConsumption> getUserTrendsForEnergyConsumption(int userId);

}
