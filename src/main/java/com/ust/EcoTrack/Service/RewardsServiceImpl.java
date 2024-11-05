package com.ust.EcoTrack.Service;


import com.ust.EcoTrack.Repository.RewardRepository;
import com.ust.EcoTrack.model.Rewards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RewardsServiceImpl implements RewardsService {

    @Autowired
    private RewardRepository rewardRepository;

    @Override
    public Rewards addReward(Rewards reward) {
        if(rewardRepository.findByRewardTitle(reward.getReward_title()) != null){
            throw new RuntimeException("Reward Also Exists");
        }
        return rewardRepository.save(reward);
    }

    @Override
    public void deleteReward(UUID rewardId) {

        if(rewardRepository.existsById(rewardId)){
            rewardRepository.deleteById(rewardId);
        }else {
            throw new RuntimeException("Reward Does not exist");
        }
    }

    @Override
    public List<Rewards> getAllRewards() {
        return rewardRepository.findAll();
    }

    @Override
    public List<Rewards> getRewardsLessThanFilterPrice(int price) {
        return rewardRepository.findRewardsLessThanPrice(price);
    }
}
