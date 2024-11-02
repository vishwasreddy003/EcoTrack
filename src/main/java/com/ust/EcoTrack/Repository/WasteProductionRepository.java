package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.GreenScores;
import com.ust.EcoTrack.model.WasteProduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public interface WasteProductionRepository extends JpaRepository<WasteProduction,Integer>
 {
  @Query("SELECT w FROM WasteProduction w WHERE w.month >= :startMonth")
  List<WasteProduction> findWasteProductionFromLastTenMonths(Month startMonth);
}
