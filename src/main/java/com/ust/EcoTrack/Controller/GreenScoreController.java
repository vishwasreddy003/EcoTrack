package com.ust.EcoTrack.Controller;

import com.ust.EcoTrack.Service.GreenScoreService;
import com.ust.EcoTrack.model.GreenScores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EcoTrack/greenscore")
public class GreenScoreController {

    @Autowired
    private GreenScoreService greenScoreService;

    @PostMapping("/addScore")
    public ResponseEntity<GreenScores> saveOrUpdateGreenScore(@RequestBody GreenScores greenScores) {
        GreenScores savedScore = greenScoreService.saveGreenScores(greenScores);
        return new ResponseEntity<>(savedScore, HttpStatus.CREATED);
    }

    @GetMapping("/analytics/{userId}")
    public ResponseEntity<List<GreenScores>> getAnalyticsForGreenScores(@PathVariable int userId) {
        List<GreenScores> scoreTrends = greenScoreService.getTrendsForGreenScores(userId);
        return new ResponseEntity<>(scoreTrends, HttpStatus.OK);
    }
}
