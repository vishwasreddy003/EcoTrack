package com.ust.EcoTrack.service;

import com.ust.EcoTrack.model.Difficulty;
import com.ust.EcoTrack.model.Goals;

import java.util.List;
import java.util.UUID;

public interface GoalService {
    public Goals addGoal(Goals goal);

    public List<Goals> getAllGoals();

    public List<Goals> getGoalsByDifficulty(Difficulty difficulty);

    public void deleteGoal(UUID goalId);

}
