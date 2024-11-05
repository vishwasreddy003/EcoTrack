package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.GreenScores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Month;
import java.util.List;
import java.util.UUID;

public interface GreenScoresRepository extends JpaRepository<GreenScores, UUID>
{

    @Query("SELECT g FROM GreenScores g WHERE g.user_id = :userId AND g.score_month >= :startDate")
    List<GreenScores> findGreenScoresFromLastTenMonths(UUID userId,Month startDate);

}
