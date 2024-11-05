package com.ust.EcoTrack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rewards {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rewardId;
    private String reward_title;
    private String brand_name;
    private int redeem_cost;
}
