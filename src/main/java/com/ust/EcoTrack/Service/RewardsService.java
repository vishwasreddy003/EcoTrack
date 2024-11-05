package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.model.Rewards;

import java.util.List;

public interface RewardsService {

    public Rewards addReward(Rewards reward);

    public void deleteReward(int rewardId);

    public List<Rewards> getAllRewards();

    public List<Rewards> getRewardsLessThanFilterPrice(int price);
}
