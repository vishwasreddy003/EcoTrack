package com.ust.EcoTrack.Repository;

import com.ust.EcoTrack.model.Goals;
import com.ust.EcoTrack.model.Rewards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RewardRepository extends JpaRepository<Rewards, Integer> {

    @Query("SELECT r FROM Rewards r WHERE r.redeem_cost < :price")
    List<Rewards> findRewardsLessThanPrice(int price);

    @Query("SELECT r FROM Rewards r WHERE r.reward_title = :title")
    Goals findByRewardTitle(String title);
}
