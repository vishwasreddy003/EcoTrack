package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.model.GreenScores;

import java.util.List;
import java.util.Optional;

public interface GreenScoreService {

    GreenScores saveGreenScores(GreenScores greenScores);

    List<GreenScores> getTrendsForGreenScores(int id);

}
