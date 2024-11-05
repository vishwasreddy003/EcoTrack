package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.Repository.GoalRepository;
import com.ust.EcoTrack.model.Difficulty;
import com.ust.EcoTrack.model.Goals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalRepository goalRepo;

    @Override
    public Goals addGoal(Goals goal) {
        if (goalRepo.findByGoalTitle(goal.getGoal_title()) != null) {
            throw new RuntimeException("Goal with this title already exists");
        }
        return goalRepo.save(goal);
    }

    @Override
    public List<Goals> getAllGoals() {
        return goalRepo.findAll();
    }

    @Override
    public List<Goals> getGoalsByDifficulty(Difficulty difficulty) {
        return goalRepo.findGoalsByDifficulty(difficulty);
    }

    @Override
    public void deleteGoal(UUID goalId) {
        if(goalRepo.existsById(goalId)){
            goalRepo.deleteById(goalId);
        }else{
            throw new RuntimeException("Goal Does not Exist");
        }
    }
}
