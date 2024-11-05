package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.Goals;
import com.ust.EcoTrack.model.Difficulty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GoalRepository extends JpaRepository<Goals, Integer> {


    @Query("SELECT g FROM Goals g WHERE g.goal_difficulty = :difficulty")
    List<Goals> findGoalsByDifficulty(Difficulty difficulty);

    @Query("SELECT g FROM Goals g WHERE g.goal_title = :title")
    Goals findByGoalTitle(String title);
}
