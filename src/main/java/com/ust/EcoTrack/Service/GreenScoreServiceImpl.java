package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.Repository.GreenScoresRepository;
import com.ust.EcoTrack.model.GreenScores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class GreenScoreServiceImpl implements GreenScoreService{

    @Autowired
    private GreenScoresRepository greenScoresRepository;

    @Override
    public GreenScores saveGreenScores(GreenScores greenScores) {
        if(!greenScoresRepository.existsById(greenScores.getScore_id())){
            return greenScoresRepository.save(greenScores);
        }else{
            throw new RuntimeException("Already Exists");
        }
    }

    @Override
    public List<GreenScores> getTrendsForGreenScores(int id) {
        LocalDate startDate = LocalDate.now().minusMonths(10);
        return greenScoresRepository.findGreenScoresFromLastTenMonths(startDate);
    }
}
