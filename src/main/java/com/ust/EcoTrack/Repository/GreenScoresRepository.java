package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.GreenScores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public interface GreenScoresRepository extends JpaRepository<GreenScores,Integer>
{

    @Query("SELECT g FROM GreenScores g WHERE g.score_month >= :startDate")
    List<GreenScores> findGreenScoresFromLastTenMonths(Month startDate);

}
