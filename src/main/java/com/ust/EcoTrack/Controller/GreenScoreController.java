package com.ust.EcoTrack.Controller;

import com.ust.EcoTrack.Service.GreenScoreService;
import com.ust.EcoTrack.model.GreenScores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EcoTrack/greenscore")
public class GreenScoreController {

    @Autowired
    private GreenScoreService greenScoreService;

    @PostMapping
    public GreenScores saveOrUpdateGreenScore(GreenScores greenScores){
        return greenScoreService.saveGreenScores(greenScores);
    }

    @GetMapping("/analytics/${userId}")
    public List<GreenScores> getAnalyticsForGreenScores(@PathVariable int userId){
        return greenScoreService.getTrendsForGreenScores(userId);
    }


}
