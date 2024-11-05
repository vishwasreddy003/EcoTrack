package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.EnergyConsumption;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.UUID;

public interface EnergyConsumptionRepository extends JpaRepository<EnergyConsumption, UUID> {
    @Query("SELECT COUNT(e) > 0 FROM EnergyConsumption e WHERE e.user_id = :userId AND e.month = :month")
    boolean existsByUserIdAndMonth(UUID userId, Month month);

    @Query("SELECT e FROM EnergyConsumption e WHERE e.user_id =:userId AND e.month >= :startMonth")
    List<EnergyConsumption> findEnergyConsumptionOfLast10Months(UUID userId,Month startMonth);

}
