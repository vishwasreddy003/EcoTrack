package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.model.Difficulty;
import com.ust.EcoTrack.model.Goals;

import java.util.List;

public interface GoalService {
    public Goals addGoal(Goals goal);

    public List<Goals> getAllGoals();

    public List<Goals> getGoalsByDifficulty(Difficulty difficulty);

    public void deleteGoal(int goalId);

}
