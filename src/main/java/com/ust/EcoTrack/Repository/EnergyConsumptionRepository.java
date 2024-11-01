package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.EnergyConsumption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnergyConsumptionRepository extends JpaRepository<EnergyConsumption,Integer> {
}
