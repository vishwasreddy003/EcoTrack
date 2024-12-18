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
import java.time.Month;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GreenScores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID score_id;
    private UUID user_id;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Month score_month;
    private float score_value;
    private String feedback;

}
