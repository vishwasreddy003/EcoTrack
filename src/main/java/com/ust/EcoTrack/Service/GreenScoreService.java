package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.model.GreenScores;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GreenScoreService {

    GreenScores saveGreenScores(GreenScores greenScores);

    List<GreenScores> getTrendsForGreenScores(String username);

}
