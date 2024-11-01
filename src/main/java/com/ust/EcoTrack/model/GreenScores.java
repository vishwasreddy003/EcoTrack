package com.ust.EcoTrack.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GreenScores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int score_id;
    private int user_id;
    @JsonFormat(pattern = "MMM")
    private LocalDate score_month;
    private float score_value;
    private String feedback;

}
