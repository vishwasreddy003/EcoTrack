package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.GreenScores;
import com.ust.EcoTrack.model.WasteProduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.UUID;

public interface WasteProductionRepository extends JpaRepository<WasteProduction, UUID>
 {
  @Query("SELECT w FROM WasteProduction w WHERE w.user_id = :userId AND w.month >= :startMonth")
  List<WasteProduction> findWasteProductionFromLastTenMonths(UUID userId,Month startMonth);
}
