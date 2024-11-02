package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.FuelType;
import com.ust.EcoTrack.model.TransportationLog;
import com.ust.EcoTrack.model.TransportationMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransportationLogRepository extends JpaRepository<TransportationLog,Integer> {
    @Query("SELECT t FROM TransportationLog t WHERE t.user_id = :userId")
    List<TransportationLog> findByUserId(int userId);

    @Query("SELECT t FROM TransportationLog t WHERE t.user_id = :userId AND t.transportation_mode = :transportationMode")
    List<TransportationLog> findByUserIdAndTransportMode(int userId, TransportationMode transportationMode);

    @Query("SELECT t FROM TransportationLog t WHERE t.user_id = :userId AND t.fuel_type = :fuelType")
    List<TransportationLog> findByUserIdAndFuelType(int userId, FuelType fuelType);
}
