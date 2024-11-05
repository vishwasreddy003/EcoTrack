package com.ust.EcoTrack.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import java.util.UUID;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goals{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID goal_id;

    public String goal_title;
    public String goal_description;

    @Enumerated(EnumType.STRING)
    public Frequency goal_frequency;

    @Enumerated(EnumType.STRING)
    public Difficulty goal_difficulty;

    public int green_coins;
}
