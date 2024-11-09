package com.ust.EcoTrack.service;

import com.ust.EcoTrack.model.GreenScores;

import java.util.List;

public interface GreenScoreService {

    GreenScores saveGreenScores(GreenScores greenScores);

    List<GreenScores> getTrendsForGreenScores(String username);

}
