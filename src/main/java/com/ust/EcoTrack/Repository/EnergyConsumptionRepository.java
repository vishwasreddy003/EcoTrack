package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.EnergyConsumption;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EnergyConsumptionRepository extends JpaRepository<EnergyConsumption,Integer> {
    @Query("SELECT COUNT(e) > 0 FROM EnergyConsumption e WHERE e.user_id = :userId AND e.month = :month")
    boolean existsByUserIdAndMonth(int userId, LocalDate month);

    @Query("SELECT e FROM EnergyConsumption e WHERE e.month >= :startMonth")
    List<EnergyConsumption> findEnergyConsumptionOfLast10Months(LocalDate startMonth);

}
