package com.ust.EcoTrack.controller;

import com.ust.EcoTrack.service.GoalService;
import com.ust.EcoTrack.model.Difficulty;
import com.ust.EcoTrack.model.Goals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/EcoTrack/goals")
public class GoalController {

    @Autowired
    private GoalService goalService;


    @PostMapping("/add")
    public ResponseEntity<?> addGoal(@RequestBody Goals goal) {
        try {
            Goals addedGoal = goalService.addGoal(goal);
            return new ResponseEntity<>(addedGoal, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/allGoals")
    public ResponseEntity<List<Goals>> getGoals() {
        List<Goals> goals = goalService.getAllGoals();
        return new ResponseEntity<>(goals, HttpStatus.OK);
    }


    @GetMapping("/difficulty/{level}")
    public ResponseEntity<List<Goals>> getGoalsByDifficulty(@PathVariable Difficulty level) {
        List<Goals> goals = goalService.getGoalsByDifficulty(level);
        return new ResponseEntity<>(goals, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteGoal(@PathVariable UUID goalId) {
        goalService.deleteGoal(goalId);
        return new ResponseEntity<>("Goal deleted successfully", HttpStatus.OK);
    }
}
