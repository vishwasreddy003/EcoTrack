package com.ust.EcoTrack.controller;

import com.ust.EcoTrack.service.RewardsService;
import com.ust.EcoTrack.model.Rewards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/EcoTrack/rewards")
public class RewardsController {

    @Autowired
    private RewardsService rewardsService;

    @PostMapping("/add")
    public ResponseEntity<Rewards> addReward(@RequestBody Rewards reward) {
        Rewards addedReward = rewardsService.addReward(reward);
        return new ResponseEntity<>(addedReward, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteReward(@PathVariable UUID rewardId) {
        rewardsService.deleteReward(rewardId);
        return new ResponseEntity<>("Reward deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Rewards>> getAllRewards() {
        List<Rewards> rewardsList = rewardsService.getAllRewards();
        return new ResponseEntity<>(rewardsList, HttpStatus.OK);
    }

    @GetMapping("/filter/{price}")
    public ResponseEntity<List<Rewards>> getRewardsLessThanPrice(@PathVariable int price) {
        List<Rewards> filteredRewards = rewardsService.getRewardsLessThanFilterPrice(price);
        return new ResponseEntity<>(filteredRewards, HttpStatus.OK);
    }
}
