package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.FuelType;
import com.ust.EcoTrack.model.TransportationLog;
import com.ust.EcoTrack.model.TransportationMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface TransportationLogRepository extends JpaRepository<TransportationLog, UUID> {
    @Query("SELECT t FROM TransportationLog t WHERE t.user_id = :userId")
    List<TransportationLog> findByUserId(UUID userId);

    @Query("SELECT t FROM TransportationLog t WHERE t.user_id = :userId AND t.transportation_mode = :transportationMode")
    List<TransportationLog> findByUserIdAndTransportMode(UUID userId, TransportationMode transportationMode);

    @Query("SELECT t FROM TransportationLog t WHERE t.user_id = :userId AND t.fuel_type = :fuelType")
    List<TransportationLog> findByUserIdAndFuelType(UUID userId, FuelType fuelType);

    @Query("SELECT t.month, SUM(t.carbon_emissions) FROM TransportationLog t WHERE t.user_id = :userId GROUP BY t.month")
    List<Object[]> findMonthlyCarbonEmissionsByUserId(UUID userId);

}
