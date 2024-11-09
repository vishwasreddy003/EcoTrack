package com.ust.EcoTrack.service;

import com.ust.EcoTrack.repository.GreenScoresRepository;
import com.ust.EcoTrack.repository.UserRepository;
import com.ust.EcoTrack.model.GreenScores;
import com.ust.EcoTrack.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class GreenScoreServiceImpl implements GreenScoreService{

    @Autowired
    private GreenScoresRepository greenScoresRepository;

    @Autowired
    private UserRepository userRepo;

    @Override
    public GreenScores saveGreenScores(GreenScores greenScores) {
        return greenScoresRepository.save(greenScores);
    }

    @Override
    public List<GreenScores> getTrendsForGreenScores(String username) {
        User user = userRepo.findByUserName(username);
        Month startDate = LocalDate.now().minusMonths(10).getMonth();
        return greenScoresRepository.findGreenScoresFromLastTenMonths(user.getUser_id(),startDate);
    }
}
